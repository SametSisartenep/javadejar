JC=javac
JR=java
JFLAGS=-classpath .
O=class

TARG=eu.atl.main.HelloWorld
OFILES=\
	eu/atl/main/HelloWorld.class\
	eu/atl/err/Hunchback.class\

.PHONY: all clean
all: $(TARG)

%.class: %.java
	$(JC) $(JFLAGS) $<

$(TARG): $(OFILES)

run:
	$(JR) $(TARG)

clean:
	rm $(OFILES)
