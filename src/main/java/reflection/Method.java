package reflection;

import java.util.ArrayList;
import java.util.List;

public class Method {
    String name;
    String returnType;
    String  signature;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Method(String name, String returnType, String signature) {
        this.name = name;
        this.returnType = returnType;
        this.signature = signature;
    }
}
