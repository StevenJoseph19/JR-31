tasks.register("hello") {
		doFirst {
			
			println("Hel")
		}

		doLast {
			
			println("lo, ")
		}
}	
tasks.register("world") {
		dependsOn("hello")
		

		doFirst {
			
			println(" Wo")
		}

		doLast {
			
			println("rld")
		}
}