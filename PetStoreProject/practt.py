class PairDivision:
    def __init__(self, a=1, b=1):  # Correcting the __init__ method definition
        self.a = a  # Assigning 'a' to self.a
        self.b = b  # Assigning 'b' to self.b

    def floordiv(self, other):
        a = self.a // self.b
        b = other.a // other.b
        return (a, b)

p1 = PairDivision(10.3, 2.5)
p2 = PairDivision(20.5)
print(p1//p2)  # Correcting the method call and the print statement
