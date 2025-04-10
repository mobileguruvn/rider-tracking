package com.brian.tracking_impl.di

import com.brian.tracking_contract.TrackingNavigator
import com.brian.tracking_contract.TrackingRepository
import com.brian.tracking_impl.data.repository.TrackingRepositoryImpl
import com.brian.tracking_impl.navigation.TrackingNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class TrackingModule {

    @Binds
    abstract fun bindTrackingNavigator(
        trackingNavigation: TrackingNavigation,
    ): TrackingNavigator

    @Binds
    abstract fun bindTrackingRepository(
        trackingRepositoryImpl: TrackingRepositoryImpl,
    ): TrackingRepository

}