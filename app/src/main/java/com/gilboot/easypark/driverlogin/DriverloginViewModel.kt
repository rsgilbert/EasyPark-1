package com.gilboot.easypark.driverlogin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gilboot.easypark.Repository
import kotlinx.coroutines.launch

class DriverloginViewModel(val repository: Repository) : ViewModel() {
    val navigateToParksLiveData = MutableLiveData<Unit>()

}

fun DriverloginViewModel.navigateToParks() {
    navigateToParksLiveData.value = Unit
}

fun DriverloginViewModel.navigateToParksComplete() {
    navigateToParksLiveData.value = null
}


fun DriverloginViewModel.loginDriver(email: String, password: String) {
    viewModelScope.launch {
        val isSuccess = repository.loginDriver(email, password)
        isSuccess?.let {
            navigateToParks()
        }
    }
}