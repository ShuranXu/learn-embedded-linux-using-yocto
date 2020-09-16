# 
# what to call the final executable
TARGET=helloworld-make

# which object files that the executable consists of
OBJS=helloworld-make.o

# what compile to use
CC=gcc

# compile flags
CFLAGS=-g

# how to remove files
DEL_FILE=rm -f 

%.o : %.c 
	$(CC) -c -o $@ $< $(CFLAGS)

# link the target with all objects and libraries
${TARGET}: ${OBJS}
	${CC} -o helloworld-make ${OBJS}

clean:
	${DEL_FILE} helloworld-make.o 