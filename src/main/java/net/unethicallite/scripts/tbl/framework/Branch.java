package net.unethicallite.scripts.tbl.framework;

import net.unethicalite.api.plugins.Script;

import java.util.*;

public abstract class Branch<T extends Script> extends Leaf<T>
{

    public final List<Leaf<T>> children;

    public Branch()
    {
        this.children = new LinkedList<>();
    }


    public Branch<T> addLeafs(Leaf<T>... leaves)
    {
        Collections.addAll(this.children, leaves);
        return this;
    }

    Random calculations = new Random();
    @Override
    public int onLoop()
    {
        return children.stream()
                .filter(c -> Objects.nonNull(c) && c.isValid())
                .findAny()
                .map(tLeaf -> {
                    API.currentBranch = this.getClass().getSimpleName();
                    API.currentLeaf = tLeaf.getClass().getSimpleName();
                    return tLeaf.onLoop();
                }).orElse((int) (calculations.nextGaussian() * Math.sqrt(250) + 350));

    }
}
