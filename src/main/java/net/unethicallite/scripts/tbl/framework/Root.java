package net.unethicallite.scripts.tbl.framework;

import net.unethicalite.api.plugins.Script;

public class Root<T extends Script> extends Branch<T>
{
    @Override
    public boolean isValid()
    {
        return true;
    }
}
