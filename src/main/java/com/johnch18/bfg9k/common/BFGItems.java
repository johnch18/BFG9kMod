package com.johnch18.bfg9k.common;

import com.johnch18.bfg9k.common.items.impl.BFG9KItem;

public class BFGItems {

    public static BFG9KItem BFG9K;

    public static void init() {
        BFG9K = new BFG9KItem("bfg9k");
    }

}
