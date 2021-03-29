package com.epitech.epicture.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.epitech.epicture.data.ImgurPager
import com.epitech.epicture.model.Image
import kotlinx.coroutines.flow.Flow

/**
 * SearchViewModel contains the observable data used inside SearchFragment
 */
class SearchViewModel : ViewModel() {
    private val pager = ImgurPager()

    private val _fileType = MutableLiveData<String>()
    val fileType: LiveData<String> = _fileType

    private val _sort = MutableLiveData<String>()
    val sort: LiveData<String> = _sort

    private val _selectedImage = MutableLiveData<Image?>()
    val selectedImage: LiveData<Image?>
        get() = _selectedImage

    fun setFileType(newFileType: String) {
        this._fileType.value = newFileType
    }

    fun setSort(newSort: String) {
        this._sort.value = newSort
    }

    fun simpleSearch(query: String): Flow<PagingData<Image>> {
        return pager.simpleSearchStream(query)
    }

    fun selectImage(image: Image) {
        _selectedImage.value = image
    }

    fun selectImageDone() {
        _selectedImage.value = null
    }
}