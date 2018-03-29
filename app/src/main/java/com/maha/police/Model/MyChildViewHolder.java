package com.maha.police.Model;

import android.view.View;
import android.widget.TextView;

import com.maha.police.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**@
 * Created by sudnya-002 on 28/03/18.
 */

public class MyChildViewHolder extends ChildViewHolder {

    public TextView listChild;

    public MyChildViewHolder(View itemView) {
        super(itemView);
        listChild = itemView.findViewById(R.id.listChild);

    }

    public void onBind(String Sousdoc) {
        listChild.setText(Sousdoc);

    }


}