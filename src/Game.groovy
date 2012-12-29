
class Game {

	static main(args) {

		System.in.withReader{

			println """
        Escape The Red Bull
The unicorns were captured by the Red Bull. 
Help the last unicorn rescue the other unicors by answering these questions.
good luck! I hope you save the unicorns!
"""
			println """
choose 'a', 'b' or 'c' and press enter
1.Who was the main character?
   A.The red bull
   B.A wedding gown
   C.The last unicorn
My answer is: 
"""
			def answer = it.readLine()
			if (answer == 'c') {
				println """
2.What happened to king Haggerd when the unicorns were saved?				
	A.He had a wedding
	B.His castle fell and he fell into the ocean and died
	C.His pants ripped
My answer is:
"""
				answer = it.readLine()
				if (answer == 'b') {
					println"""
3.What lesson did the movie tell you?
    A.If you do something bad you will pay
	B.Not singing
	C.Makking paper
My answer is:						
"""
					answer = it.readLine()
					if (answer == 'a'){
						println "Great you saved the unicorns!"
					} else {
						println "Sorry, that is not correct, unicorns were not saved."
					}
				} else {
					println "Sorry, that is not correct, unicorns were not saved."
				}
			} else {
				println "Sorry, that is not correct, unicorns were not saved."
			}
		}
	}
}
