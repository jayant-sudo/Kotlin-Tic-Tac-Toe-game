import java.lang.System.exit
import java.util.Scanner
var game: Array<Char> = arrayOf('1','2','3','4','5','6','7','8','9')
var k:Int=1
fun main()
{
    val scanner = Scanner(System.`in`)
    var ch:Char
    var i :Int=0
    while (true) {
        while (i < 9) {
            if (i % 3 == 0) {
                println()
            }
            print("| ${game[i]}")
            i++
        }
        println()

        k = if (k == 1) {
            println("Player 1 turns(0)")
            2
        } else {
            println("Player 2 turns(x)")
            1
        }
        println("Enter any number : ")
        ch = scanner.next().single()
        when (ch) {
            '1' -> check(0)
            '2'->check(1)
            '3'->check(2)
            '4'->check(3)
            '5'->check(4)
            '6'->check(5)
            '7'->check(6)
            '8'->check(7)
            '9'->check(8)
            else -> {
                println("Please enter number between(1 to 9")
            }
        }
        check_result()
    }
}
fun check(index:Int){
    if(game[index] == 'x' || game[index] == '0')
    {
        println("This number is already taken ... please choose another number :)")
    }
    else {
        if (k == 1) {
            game[index] = 'x'
        } else {
            game[index] = '0'
        }
    }
}


fun check_result() {
    // horizontal line 1
    if (game[0] == 'x' && game[1] == 'x' && game[2] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[0] == '0' && game[1] == '0' && game[2] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    // horizontal line 2
    if (game[3] == 'x' && game[4] == 'x' && game[5] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[3] == '0' && game[4] == '0' && game[5] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    // horizontal line 3
    if (game[6] == 'x' && game[7] == 'x' && game[8] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[6] == '0' && game[7] == '0' && game[8] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    //vertical line 1
    if (game[0] == 'x' && game[3] == 'x' && game[6] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[0] == '0' && game[3] == '0' && game[6] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    //vertical line 2
    if (game[1] == 'x' && game[4] == 'x' && game[7] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[1] == '0' && game[4] == '0' && game[7] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    //vertical line 3
    if (game[2] == 'x' && game[5] == 'x' && game[8] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[2] == '0' && game[5] == '0' && game[8] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    //diagonal line 1
    if (game[0] == 'x' && game[4] == 'x' && game[8] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[0] == '0' && game[4] == '0' && game[8] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }

    //diagonal line 2
    if (game[2] == 'x' && game[4] == 'x' && game[6] == 'x') {
        println("player 2 wins")
        exit(0)
    }
    if (game[2] == '0' && game[4] == '0' && game[6] == '0') {
        println("Player 1 wins :)")
        exit(0)
    }
}
