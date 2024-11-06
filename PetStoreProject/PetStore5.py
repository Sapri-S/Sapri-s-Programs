#Sapri Sise 4/24/2024

import csv
import Canine as C
import Feline as F
import Snake as S
import Lizard as L

pets = ['Canine', 'Feline', 'Snake', 'Lizard']
def setupStore(inventory):
    # Enter cost of each pet in each category
    for pet in pets:
        cat = list()
        num = int(input(f"How many {pet} would you like to enter: "))
        if num <= 0: continue
        for i in range(0,num):
            animal = ''
            if pet == 'Canine':
                animal = createCanine()
            elif pet == 'Feline':
                animal = createFeline()
            elif pet == 'Snake':
                animal = createSnake()
            elif pet == 'Lizard':
                animal = createLizard()
            animal.inventory.setLocation(input('Location: '))
            animal.inventory.setQuantity(int(input('Quantity: ')))
            animal.inventory.setPrice(float(input('Price: ')))
            cat.append(animal)
#not replacing the imported things but adding to it.
        inventory[pet] = inventory.get(pet, []) + cat
    return inventory

def createCanine():
    animal = C.Canine()
    animal.setName(input('Name: '))
    animal.setSize(input('Size: '))
    animal.setWeight(float(input('Weight: ')))
    animal.setColor(input('Color: '))
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

    return animal
def createLizard():
    animal = L.Lizard()
    animal.setName(input('Name: '))
    animal.setHabitat(input('Habitat: '))
    animal.setFrill(input('Has Frill (True/False): '))
    animal.setSpikes(input('Spikes (True/False): '))
    return animal


def petStoreMenu():
    # Display the menu
    print("\n")
    print("A) Setup Store")
    print("B) Display Pets")
    print("C) Sale Pet")
    print("D) Total Sale")
    print("E) Exit")

def calculateTax(total):
    # caculate the total tax
    totalSale = 0.0
    stateTax = 0.07
    fedTax = 0.10
    totalSale += total * stateTax
    totalSale += total * fedTax
    totalSale += total
    print(f"\t\t\tState Tax \t\t\t${stateTax:.2f}")
    print(f"\t\t\tFederal Tax \t\t${fedTax:.2f}")
    print(f"\t\t\tTotal Due \t\t\t${totalSale:.2f}")

def POS(sale, inventory):

    catMenu = 1
    print("What category would you like to sale : ")
    for cat in inventory.keys():
        print(f"{catMenu}) {cat}")
        catMenu += 1
    catMenuSelection = int(input(f"What is being sold:  "))
    cat = list(inventory.keys())[catMenuSelection-1]
    petList = inventory.get(list(inventory.keys())[catMenuSelection-1])

    petMenu = 1
    for pet in petList:
        print(f"{petMenu}) {pet.getName()}")
        petMenu += 1
    petMenuSelection = int(input(f"What {cat} is being sold:  "))
    petItem = petList[petMenuSelection-1]
    if petItem.inventory.getQuantity() <= 0 :
        print("Sorry out of stock!")
    else:
        PetPrice = petItem.inventory.getPrice()
        qty = int(input(f"How many {petItem.getName()} are being sold: "))
        itemNum = len(sale)+1
        sale[itemNum] = [pets[catMenuSelection-1], petItem.getName(), PetPrice,qty,(qty*PetPrice)]
        petItem.inventory.setPrice(petItem.inventory.getPrice()-qty)
    return sale

def displayReceipt(sale):
    # test data used when testing just the D menu selection
    # sale = {1: ['Canine', 'Terrier', 56.45, 2, 112.9], 2: ['Reptile', 'Corn', 5.9, 1, 5.9]}
    print("\n")
    print("Aggie Pet Store Bill of Sale")
    print("_"*50)
    total = 0.0
    for k,v in sale.items():
        print(f"{k:d}. {v[0]}\t{v[1]}\t${v[2]:,.2f}\t{v[3]:,d}\t${v[4]:,.2f}")
        total += v[4]
    calculateTax(total)
    print("_" * 50)




def displayInventory(inventory):

    print("We offer the following pets")


    for cat, pets in inventory.items():
        print(f"{cat} : ")
        for pet in pets:
            print(f"\t{pet.getName()} count {pet.inventory.getQuantity()} cost ${pet.inventory.getPrice():,.2f}.")


#this load petstore treats the values in the csv as newly enterted values
def loadPetStore():
    with open('PetStore.csv', 'r', newline='') as csvfile:
        reader = csv.reader(csvfile, delimiter=',')
        imported_values = dict()
        for row in reader:
#opens setUpStore if the file is empty
            if row[0] == 'empty':
                setupStore(inventory)
                break

            pet = list()
            petName = row[1]
            if row[0] in pets:

#checking the first value of each row to get what the code should ask for
                if row[0] == 'Canine':
                    cat = row[0]
                    Quant = int(row[2])
                    cost = float(row[3])
                    weight = float(row[4])
                    size = row[5]
                    color = row[6]

                    animal = C.Canine()
                    animal.setName(petName)
                    animal.inventory.setQuantity(Quant)
                    animal.inventory.setPrice(cost)
                    animal.setSize(size)
                    animal.setWeight(weight)
                    animal.setColor(color)
                    pet.append(animal)
                if row[0] == 'Feline':
                    cat = row[0]
                    Quant = int(row[2])
                    cost = float(row[3])
                    weight = float(row[4])
                    size = row[5]
                    color = row[6]

                    animal = F.Feline()
                    animal.setName(petName)
                    animal.inventory.setQuantity(Quant)
                    animal.inventory.setPrice(cost)
                    animal.setSize(size)
                    animal.setWeight(weight)
                    animal.setColor(color)
                    pet.append(animal)
                if row[0] == 'Snake':
                    cat = row[0]
                    Quant = int(row[2])
                    cost = float(row[3])
                    constr = row[4]
                    color = row[5]
                    animal = S.Snake()
                    animal.setName(petName)
                    animal.inventory.setQuantity(Quant)
                    animal.inventory.setPrice(cost)
                    animal.setConstrictor(constr)
                    animal.setColor(color)
                    pet.append(animal)

                if row[0] == 'Lizard':
                    cat = row[0]
                    Quant = int(row[2])
                    cost = float(row[3])
                    habit = row[4]
                    frill = row[5]
                    spikes = row[6]

                    animal = L.Lizard()
                    animal.setName(petName)
                    animal.inventory.setQuantity(Quant)
                    animal.inventory.setPrice(cost)
                    animal.setHabitat(habit)
                    animal.setFrill(frill)
                    animal.setSpikes(spikes)
                    pet.append(animal)

                inventory[cat] = inventory.get(cat, []) + pet


        return inventory






def savePetStore(inventory):
    with open('Petstore.csv', 'w', newline='') as csvfile:
        petWriter = csv.writer(csvfile)

        for cat, pets in inventory.items():
            for pet in pets:

                if cat == 'Snake':
                    row = [cat, pet.getName(), pet.inventory.getQuantity(), pet.inventory.getPrice(), pet.isConstrictor(), pet.getColor()]
                    petWriter.writerow(row)
#the lizzard moduel would bring an error when being implemented though so I raised an error to catchh them
                try:
                    if cat =='Canine' or 'Feline':
                        row = [cat, pet.getName(), pet.inventory.getQuantity(), pet.inventory.getPrice(), pet.getWeight(), pet.getSize(), pet.getColor()]
                        petWriter.writerow(row)
                except AttributeError:
                    if cat == 'Lizard':
                        row = [cat, pet.getName(), pet.inventory.getQuantity(), pet.inventory.getPrice(), pet.getHabitat(),
                               pet.hasSpikes, pet.hasSpikes()]
                        petWriter.writerow(row)







def closePetStore():
    print("Thank you for using the Aggie PetStore POS")
    print("Aggie Pride!")



if __name__ == "__main__":
    inventory = dict()
    # test data used when testing the C menu option
    # inventory = {'Canine': {'Begal': 56.45, 'Bull': 125.0}, 'Feline': {'Main Coon': 2000.0},
    #            'Reptile': {'Rat': 25.0, 'Corn': 5.9, 'Boa': 112.0}}
    sale = dict()
    totalSale = 0.0
    stateTax = 0.07
    fedTax = 0.10


    print("Welcome to the Aggie Pet Store")
    loadPetStore()
    print(inventory)

    while True:
        petStoreMenu()
        print("\n")
        option = input("Menu selection: ").upper()
        if option == "E":
            savePetStore(inventory)

            break
        elif option == "A":
            inventory = setupStore(inventory)

        elif option == "B":
            displayInventory(inventory)
        elif option == "C":
            sale = POS(sale, inventory)

        elif option == "D":
            displayReceipt(sale)
            sale= dict()
        else:
            print("Invalid Selection.... Please select again.")
            print("\n")
    # Display the pets and price
    print("\n\n")
    closePetStore()

