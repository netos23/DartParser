.source                  Simple.java
.class                   public Simple
.super                   java/lang/Object

.field                   b I
.field                   c I

.method                  public <init>()V
   .limit stack          2
   .limit locals         1
   .line                 1
   aload_0               
   invokespecial         java/lang/Object/<init>()V
   .line                 3
   aload_0               
   bipush                10
   putfield              Simple/b I
   .line                 4
   aload_0               
   bipush                20
   putfield              Simple/c I
   return                
.end method              

.method                  public static main([Ljava/lang/String;)V
   .limit stack          3
   .limit locals         3
   .line                 7
   bipush                12
   istore_1              
   .line                 8
   bipush                60
   bipush                30
   iload_1               
   imul                  
   bipush                120
   imul                  
   iadd                  
   istore_2              
   .line                 13
   return                
.end method              

