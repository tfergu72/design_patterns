import java.util.*;
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;
    public abstract String getPassword();
}
