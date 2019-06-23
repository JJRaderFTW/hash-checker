package com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.hashtypes.adapter;

import android.support.annotation.NonNull;
import android.view.View;

import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base.BaseListBottomSheet;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base.ListItemMarker;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base.adapter.BaseBottomSheetListAdapter;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.base.adapter.BaseBottomSheetListHolder;
import com.smlnskgmail.jaman.hashchecker.components.bottomsheets.lists.hashtypes.OnHashTypeSelectListener;
import com.smlnskgmail.jaman.hashchecker.hashgenerator.support.HashType;
import com.smlnskgmail.jaman.hashchecker.support.prefs.PrefsHelper;

import java.util.List;

public class HashesBottomSheetListAdapter extends BaseBottomSheetListAdapter {

    private HashType selectedHashType;
    private OnHashTypeSelectListener hashTypeSelectListener;

    public HashesBottomSheetListAdapter(@NonNull List<ListItemMarker> items,
                                        @NonNull BaseListBottomSheet bottomSheet,
                                        @NonNull OnHashTypeSelectListener hashTypeSelectListener) {
        super(items, bottomSheet);
        this.hashTypeSelectListener = hashTypeSelectListener;
        selectedHashType = PrefsHelper.getLastHashType(getBottomSheet().getContext());
    }

    @Override
    public BaseBottomSheetListHolder getItemsHolder(@NonNull View view) {
        return new HashesBottomSheetListHolder(view, this, hashTypeSelectListener);
    }

    HashType getSelectedHashType() {
        return selectedHashType;
    }

}
