package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T> extends DiffUtil.ItemCallback<T> implements ListDiffInterface<BaseListDiffCallback> {

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        if (newItem instanceof BaseListDiffCallback) {
            return theSameAs((BaseListDiffCallback) newItem);
        } else {
            return false;
        }
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }

    @Override
    public boolean theSameAs(BaseListDiffCallback objectToCompare) {
        return false;
    }
}
