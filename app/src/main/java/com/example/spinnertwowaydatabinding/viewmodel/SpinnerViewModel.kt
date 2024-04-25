package com.example.spinnertwowaydatabinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SpinnerViewModel : ViewModel() {
    enum class SpinnerItem {
        ITEM_ONE,
        ITEM_TWO,
        ITEM_THREE,
        ITEM_FOUR
    }


    val spinnerEnumValues = arrayOf(
        SpinnerItem.ITEM_ONE.name,
        SpinnerItem.ITEM_TWO.name,
        SpinnerItem.ITEM_THREE.name,
        SpinnerItem.ITEM_FOUR.name
    )

    private val selectedSpinnerItem = MutableLiveData<SpinnerItem>()

    val selectedSpinnerItemValue: SpinnerItem?
        get() {
            return selectedSpinnerItem.value?.let {
                SpinnerItem.entries[it.ordinal]
            }
        }
}