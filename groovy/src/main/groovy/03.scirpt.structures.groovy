def roman = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII']
assert roman[4] == 'IV'
roman[8] = 'VIII' // expanding the list
println roman.size() == 9

def http = [
        100 : 'CONTINUE',
        200 : 'OK',
        400 : 'BAD REQUEST'
]


for(def responce: http) {
    println(responce)
}

def ranges = 1..10

for(int i=1; i < ranges; i++) {
    println("What is happening ")
}





