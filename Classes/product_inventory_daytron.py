


class Product:
    def __init__(self,pId,name,price,quantity):
        self.id = pId
        self.name = name
        self.price = price
        self.quantity = quantity

    def updatePrice(self,new_price):
        self.price = new_price

    def updateQuantity(self,new_quantity,isIncrement):
        if isIncrement is True:
            self.quantity += new_quantity
        elif (self.quantity - new_quantity) >= 0:
            self.quantity -= new_quantity
        else:
            print "Error, cannot reduce further!"

    def getQuantity(self):
        return self.quantity

    def viewProduct(self):
        print "Product ID: " + str(self.id) + ", Name: " + self.name + ", Price: " + \
        str(self.price) + ", Quantity: " + str(self.quantity)


class Inventory:
    def __init__(self):
        self.listProd = []

    def addProduct(self,pId):
        self.listProd.append(pId)

    def removeProduct(self,pId):
        if pId in self.listProd:
            self.listProd.remove(pId)
        else:
            print "Error. Product is not in the inventory."
    
    def viewInventory(self):
        print self.listProd
        
prod1 = Product(1,"colgate",2.20,5)

print prod1.getQuantity()
prod1.updateQuantity(2,True)
prod1.viewProduct()

invent1 = Inventory()
invent1.addProduct(1)
invent1.removeProduct(2)
invent1.viewInventory()