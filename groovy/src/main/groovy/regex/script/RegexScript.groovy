package regex.script
/**
 * Created by MLKR on 07/11/2017.
 */

// Java way
assert "a\\\\b" == /a\\b/

// GString
assert "abcd" == /abcd/

def lines = getClass().getResource('/regex.txt').readLines()

lines.each {
    println(it)
}

/*
    The regex find operator, =~
    The regex match operator, ==~
    The regex pattern operator, ~string
 */


assert lines =~ /Save/


