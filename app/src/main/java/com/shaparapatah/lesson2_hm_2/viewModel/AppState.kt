package com.shaparapatah.lesson2_hm_2.viewModel

import com.shaparapatah.lesson2_hm_2.domain.Weather

sealed class AppState {
    object Loading : AppState()
    data class SuccessMain(val weatherData: List<Weather>) : AppState()
    data class SuccessDetails(val weatherData: Weather) : AppState()
    data class Error(val error: Throwable) : AppState()
}
