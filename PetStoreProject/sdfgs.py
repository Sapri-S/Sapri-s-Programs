def createCanine():
    animal = C.Canine()
    animal.setName(petName)
    animal.setSize()
    animal.setWeight()
    animal.setColor()

    animal.inventory.setQuantity(Quant)
    animal.inventory.setPrice(cost)
    return animal
def createFeline():
    animal = F.Feline()
    animal.setName(input('Name: '))
    animal.setSize(input('Size (S/M/L/XL): '))
    animal.setWeight(float(input('Weight: ')))
    animal.setColor(input('Color:'))
    return animal
def createSnake():
    animal = S.Snake()
    animal.setName(input('Name: '))
    animal.setConstrictor(bool(input('Is Constrictor (True/False): ')))
    animal.setColor(input('Color: '))