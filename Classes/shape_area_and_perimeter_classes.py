

class Shapes:
	def __init__(self,name,stype):
		self.name = name
		self.type = stype

	def getName(self):
		return self.name

	def getType(self):
		return self.stype


class Square(Shapes):
	def __init__(self,name,side):
		Shapes.__init__(self,name,"square")
		self.side = side

	def getArea(self):
		return self.side * self.side

	def getPerimeter(self):
		return self.side * 4


class Circle(Shapes):
	def __init__(self,name,radius):
		Shapes.__init__(self,name,"circle")
		self.radius = radius

	def getArea(self):
		return 3.141516 * (self.radius * self.radius)


if __name__ == '__main__': 
	squary = Square("Squary",4)

	print isinstance(squary, Square)
	print isinstance(squary, Shapes)

	print squary.getPerimeter()
	print squary.getArea()
	print squary.getName()

	circly = Circle("Circly",3)

	print circly.getArea()
	print circly.getName()