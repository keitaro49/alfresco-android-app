/*******************************************************************************
 * Copyright (C) 2005-2014 Alfresco Software Limited.
 *
 * This file is part of Alfresco Mobile for Android.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.alfresco.mobile.android.application.widgets;

import java.util.List;

import org.alfresco.mobile.android.application.R;
import org.alfresco.mobile.android.ui.fragments.BaseListAdapter;
import org.alfresco.mobile.android.ui.utils.GenericViewHolder;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

public class ActionShortcutAdapter extends BaseListAdapter<Integer, GenericViewHolder>
{
    public ActionShortcutAdapter(Activity context, int textViewResourceId, List<Integer> listItems)
    {
        super(context, textViewResourceId, listItems);
    }

    @Override
    protected void updateTopText(GenericViewHolder vh, Integer item)
    {
        vh.topText.setText(getContext().getString(item));
    }

    @Override
    protected void updateBottomText(GenericViewHolder vh, Integer item)
    {
        vh.bottomText.setVisibility(View.GONE);
    }

    @Override
    protected void updateIcon(GenericViewHolder vh, Integer item)
    {
        int iconId = R.drawable.ic_doc_light;
        switch (item)
        {
            case R.string.action_text:
                iconId = R.drawable.ic_doc_light;
                break;
            case R.string.action_speech2text:
                iconId = R.drawable.ic_microphone;
                break;
            case R.string.action_photo:
                iconId = R.drawable.ic_camera;
                break;
            default:
                break;
        }
        vh.icon.setImageDrawable(getContext().getResources().getDrawable(iconId));
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent)
    {
        return getView(position, convertView, parent);
    }
}
