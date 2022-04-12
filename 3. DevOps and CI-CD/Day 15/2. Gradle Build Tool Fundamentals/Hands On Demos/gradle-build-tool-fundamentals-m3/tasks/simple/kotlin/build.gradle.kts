tasks.register("hello") {
		doFirst {
			print("Hello")

		}

		doLast {
		       println(", Gradle")

		}

}