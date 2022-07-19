package net.unethicallite.scripts.tbl;

import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.plugins.Script;
import net.unethicallite.scripts.tbl.behaviour.BuyWoadLeaf;
import net.unethicallite.scripts.tbl.framework.Tree;
import org.pf4j.Extension;

@PluginDescriptor(name = "Ausbots Tbl for unethical", enabledByDefault = false)
@Extension
public class TreeBranchLeaf extends Script
{
    private final Tree<TreeBranchLeaf> tree = new Tree<>();
    @Override
    protected int loop()
    {
        return tree.onLoop();
    }


    @Override
    public void onStart(String... strings)
    {
        System.out.println("ON START");
        tree.addBranches(new BuyWoadLeaf());
    }
}
