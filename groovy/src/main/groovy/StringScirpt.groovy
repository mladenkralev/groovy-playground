def nick = 'ReGina'
def book = 'Groovy in Action, 2nd ed.'

assert "$nick is $book" == 'ReGina is Groovy in Action, 2nd ed.'

def gStringTest = "Hello $nick this is the books I was taliking about. $book"

println(nick)
println(book)
println(gStringTest)



