.source    Person.java
.class     public Person
.super     java/lang/Object
.field   c I
.field   f I
.field   prev I
.field   nextPrev I
.method                  public <init>()V
   .limit stack          16
   .limit locals         16
   .line                 1
   aload_0
   invokespecial         java/lang/Object/<init>()V
   aload_0
   ldc     1
   putfield Person/c I
   aload_0
   ldc     0
   putfield Person/f I
   aload_0
   ldc     1
   putfield Person/prev I
   aload_0
   ldc     1
   putfield Person/nextPrev I
   return
.end method

.method    public rec(I)V
   .limit stack    16
   .limit locals    16
   iload     1
   ldc     0
   if_icmple             LABEL0x7
   iload     1
   ldc     1
   isub 
   istore             1  
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   iload     1
   aload_0     
   getfield     Person/c I
   iadd 
   invokevirtual         java/io/PrintStream/println(I)V
   aload_0
   iload     1
   ldc     1
   isub 
   invokevirtual Person/rec(I)V
LABEL0x7:
return
.end method

.method    public fact()V
   .limit stack    16
   .limit locals    16
   aload_0     
   getfield     Person/c I
   aload_0     
   getfield     Person/f I
   if_icmpge             LABEL0x8
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   aload_0     
   getfield     Person/prev I
   aload_0     
   getfield     Person/c I
   imul 
   invokevirtual         java/io/PrintStream/println(I)V
   aload_0
   aload_0     
   getfield     Person/prev I
   aload_0     
   getfield     Person/c I
   imul 
   putfield              Person/prev I   
   aload_0
   aload_0     
   getfield     Person/c I
   ldc     1
   iadd 
   putfield              Person/c I   
   aload_0
   invokevirtual Person/fact()V
LABEL0x8:
return
.end method

.method    public fib()V
   .limit stack    16
   .limit locals    16
   aload_0     
   getfield     Person/c I
   aload_0     
   getfield     Person/f I
   if_icmpge             LABEL0x9
   getstatic             java/lang/System/out Ljava/io/PrintStream;
   aload_0     
   getfield     Person/prev I
   aload_0     
   getfield     Person/nextPrev I
   iadd 
   invokevirtual         java/io/PrintStream/println(I)V
   aload_0     
   getfield     Person/nextPrev I
   istore_1
   aload_0
   aload_0     
   getfield     Person/prev I
   aload_0     
   getfield     Person/nextPrev I
   iadd 
   putfield              Person/nextPrev I   
   aload_0
   iload     1
   putfield              Person/prev I   
   aload_0
   aload_0     
   getfield     Person/c I
   ldc     1
   iadd 
   putfield              Person/c I   
   aload_0
   invokevirtual Person/fib()V
LABEL0x9:
return
.end method

.method    public start(II)V
   .limit stack    16
   .limit locals    16
   aload_0
   iload     1
   putfield              Person/c I   
   aload_0
   iload     2
   putfield              Person/f I   
   aload_0
   invokevirtual Person/fact()V
   aload_0
   ldc     1
   putfield              Person/prev I   
   aload_0
   ldc     1
   putfield              Person/nextPrev I   
   aload_0
   iload     1
   putfield              Person/c I   
   aload_0
   iload     2
   putfield              Person/f I   
   aload_0
   invokevirtual Person/fib()V
return
.end method

.method                  public static main([Ljava/lang/String;)V
   .limit stack    16
   .limit locals    16
   ldc     24
   ldc     18
   ldc     7
   ldc     6
   isub 
   imul 
   isub 
   ldc     1
   iadd 
   istore_1
   ldc     24
   ldc     18
   ldc     7
   ldc     6
   isub 
   imul 
   isub 
   ldc     5
   iadd 
   istore_2
   new   Person
   dup
   invokespecial         Person/<init>()V
   astore         3
   aload 3
   ldc     1
   ldc     10
   invokevirtual Person/start(II)V
   aload 3
   iload     1
   invokevirtual Person/rec(I)V
return
.end method

