package com.yar.threading;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.List;

public class ListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private HashMap<String, List<String>> movieData;
    private List<String> movieList;

    public ListAdapter(Context context, HashMap<String, List<String>> movieData, List<String> movieList) {
        this.context = context;
        this.movieData = movieData;
        this.movieList = movieList;
    }


    @Override
    public int getGroupCount() {
        return movieList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return movieData.get(movieList.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return movieList.get(groupPosition);
    }

    @Override
    public Object getChild(int parent, int child) {
        return movieData.get(movieList.get(parent)).get(child);

    }

    @Override
    public long getGroupId(int groupPosition) {

        return groupPosition;
    }

    @Override
    public long getChildId(int  parent, int child) {
        return child;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String groupTitle = (String) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_layout, parent, false);

        }
        TextView parentTextview = (TextView) convertView.findViewById(R.id.parent_txtv);
        parentTextview.setTypeface(null, Typeface.BOLD);
        parentTextview.setText(groupTitle);

        return convertView;
    }

    @Override
    public View getChildView(int parent, int child, boolean isLastChild, View convertView, ViewGroup parentView) {
        String childTitle = (String) getChild(parent, child);

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_layout, parentView, false);
        }

        TextView childTextView = (TextView) convertView.findViewById(R.id.child_txtv);
        childTextView.setText(childTitle);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
