package cscie160.project;

import java.util.HashMap;

/**
 * Security class
 * 
 * @author Reagan Williams
 * @version 1.7 (project)
 * @since 2011-12-07
 */
public class Security
{
    public static HashMap<AccountInfo> ai;

    public Security()
    {
        ai.put(new AccountInfo(1, 1234));
        ai.put(new AccountInfo(2, 2345));
        ai.put(new AccountInfo(3, 3456));
    }

    public boolean authenticate(AccountInfo aiobj)
    {
        for (AccountInfo iter : ai.values())
        {
            if (aiobj.equals(iter))
            {

            }
        }
    }
}
