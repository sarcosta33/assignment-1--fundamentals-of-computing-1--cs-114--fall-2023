filename = Assignment1

all: compile run

compile:
	java $(filename).java
run:
	java $(filename).java
