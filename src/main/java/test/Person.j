.source    Person.java
.class     public Person
.super     java/lang/Object
.field   c I
.field   f I
.method                  public <init>()V
   .limit stack          16
   .limit locals         16
   .line                 1
   aload_0
   invokespecial         java/lang/Object/<init>()V
   aload_0
   ldc     10
   putfield Person/c I
   aload_0
   ldc     1
   putfield Person/f I
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

.method    public start(I)V
   .limit stack    16
   .limit locals    16
   aload_0
   iload     1
   putfield              Person/c I   
return
.end method

.method    public fact()V
   .limit stack    16
   .limit locals    16
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
   new   Person
   dup
   invokespecial         Person/<init>()V
   astore         2
   aload 2
   iload     1
   invokevirtual Person/start(I)V
   aload 2
   iload     1
   invokevirtual Person/rec(I)V
return
.end method

