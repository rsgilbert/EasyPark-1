package com.gilboot.easypark.dashboard


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gilboot.easypark.Repository

@Suppress("UNCHECKED_CAST")
class DashboardViewModelFactory(private val repository: Repository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        DashboardViewModel(repository) as T
}