package net.unethicallite.scripts.tbl.framework;


import net.unethicalite.api.plugins.Script;

public abstract class Leaf<T extends Script>
{
    public abstract boolean isValid();

    public abstract int onLoop();
}
