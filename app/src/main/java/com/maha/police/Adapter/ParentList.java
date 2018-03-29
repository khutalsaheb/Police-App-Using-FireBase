package com.maha.police.Adapter;

import com.maha.police.Model.ChildList;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by sudnya-002 on 28/03/18.
 */

public class ParentList extends ExpandableGroup<ChildList> {



    public ParentList(String title, List<ChildList> items) {
        super(title, items);
    }

}