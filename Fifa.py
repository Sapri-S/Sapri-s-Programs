#globals
playerPool = {}
meanRating = 0
meanAge = 0
country = []
teams = []
formations=[]
'''ST = 'Striker'
LW = 'Left Winger'
RW = 'Right Winger'
CF = 'Center Forward'
LF = 'Left Forward'
RF = 'Right Forward'
CAM = 'Center Attacking Midfeilder'
LM = 'Left Midfeilder'
RM = 'Right Midfeilder'
CM = 'Center Midfeilder'
CDM = 'Center Defensive Midfeilder'
LWB = 'Left Wing-Back'
RWB = 'Right Wing-Back'
CB = 'Center-Back'
GK = 'Goal Keeper'
'''
ST = 0
LW = 0
RW = 0
CF = 0
LF = 0
RF = 0
CAM = 0
LM = 0
RM = 0
CM = 0
CDM = 0
LWB = 0
RWB = 0
CB = 0
GK = 0
position = ['ST','LW','RW','CF','LF','RF','CAM','LM','RM','CM','CDM','LWB','RWB','CB','GK']

#enter player minmim of 11 unless there are already 11 players/// ask for /team, rating, player number, age,counrty,position\
playerAmount = int(input('Enter the number of players you want to add: '))
class playerInfo():
    def __init__(self):
        self.playerName = ''
        self.playerRating = 0
        self.playerTeam = ''
        self.playerCon = ''
        self.playerAge = ''
        self.playerNumber = ''
        self.playerPosition = ''

    def playerRank(self,player):
        self.playerPosition = input('What position is this player: ').upper()
        while self.playerPosition not in position:
            print('Invalid try again')
            self.playerPosition = input('What position is this player: ').upper()
        self.playerName = input('Enter the name of the player: ')
        self.playerRating = input('Enter the fifa rating of the player: ')
        self.playerTeam = input('Enter the fifa team: ')
        self.playerCon = input('Enter the country of the player: ')
        self.playerAge = input('Enter the Age of the player: ')
        self.playerNumber = input('Enter the Players Number: ')

        playerPool[player] = {'name': self.playerName
            , 'rating': self.playerRating,
                              'team': self.playerTeam,
                              'age': self.playerAge,
                              'number': self.playerNumber,
                              'country': self.playerCon,
                              'position': self.playerPosition,
                              'value': 0}


players = playerInfo()

for i in range(playerAmount):
    players.playerRank(i)
#test for rating , team, country first

#rating test
def playerRatingMean(meanRating):
    for key, value in playerPool.items():
        rat = int(value['rating'])
        value['value'] = rat
        meanRating += rat

    meanRating /= playerAmount
    print(f'{meanRating} mean rating')

    for key, value in playerPool.items():
        RatingValue = int(value['rating'])
        net = round(RatingValue - meanRating)
        value['value'] = net
    print(f'{net}')
#rating test end

#TeamTest
def playerTeamValue(teams):
    for key, value in playerPool.items():
        teams.append(value['team'])

    for key, value in playerPool.items():
        x = teams.count(value['team'])
        if x > 1:
            valueNum = int(value['value'])
            valueNum += x + 5
            value['value'] = valueNum
#TeamTest

def playerAgeMean(meanAge):
    for key, value in playerPool.items():
        age = int(value['age'])
        meanAge += age
    meanAge = round(meanAge/playerAmount)
    print(f'{meanAge} Mean Age')
    for key, value in playerPool.items():
        age = int(value['age'])
        net = age - meanAge
        if net > 0:
            net *= -1
            value['value'] += net
        elif net < 0:
            value['value'] += net
def playerCountry(country):
    for key, value in playerPool.items():
        country.append(value['country'])

    for key, value in playerPool.items():
        x = country.count(value['country'])
        if x > 1:
            valueNum = int(value['country'])
            valueNum += x + 5
            value['country'] = valueNum
    print('\r')
    print(f'loading...',)#maybe add \r
#order players 1 - n to see the best players without age and postion, give a value hightes to lowest
#ask the player what formation they want



playerRatingMean(meanRating)
playerTeamValue(teams)
playerAgeMean(meanAge)
playerCountry(country)
print('first test over')

print(playerPool)







#test for position and add poits based on how close the player is to the mean and reorder the list
#test by age and add less points by whos closer the mean age
#order the team by best to worse and print starting 11
#effcientcy map
#import things from csv
#change player number if theyre are more than one ith the same number
#find the best formation with the player given