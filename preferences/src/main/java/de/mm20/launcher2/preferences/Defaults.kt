package de.mm20.launcher2.preferences

import android.content.Context

fun createFactorySettings(context: Context): Settings {
    return Settings.newBuilder()
        .setAppearance(
            Settings.AppearanceSettings
                .newBuilder()
                .setTheme(Settings.AppearanceSettings.Theme.System)
                .setColorScheme(Settings.AppearanceSettings.ColorScheme.Default)
                .setDimWallpaper(false)
                .build()
        )
        .setWeather(
            Settings.WeatherSettings
                .newBuilder()
                .setProvider(Settings.WeatherSettings.WeatherProvider.MetNo)
                .setImperialUnits(context.resources.getBoolean(R.bool.default_imperialUnits))
                .build()
        )
        .setMusicWidget(
            Settings.MusicWidgetSettings
                .newBuilder()
                .setFilterSources(true)
                .build()
        )
        .setCalendarWidget(
            Settings.CalendarWidgetSettings
                .newBuilder()
                .setHideAlldayEvents(false)
        )
        .setClockWidget(
            Settings.ClockWidgetSettings
                .newBuilder()
                .setLayout(Settings.ClockWidgetSettings.ClockWidgetLayout.Vertical)
                .setClockStyle(Settings.ClockWidgetSettings.ClockStyle.DigitalClock1)
                .build()
        )
        .setFavorites(
            Settings.FavoritesSettings
                .newBuilder()
                .setEnabled(true)
        )
        .setFileSearch(
            Settings.FilesSearchSettings
                .newBuilder()
                .setLocalFiles(true)
                .setNextcloud(false)
                .setGdrive(false)
                .setOnedrive(false)
                .setNextcloud(false)
        )
        .setContactsSearch(
            Settings.ContactsSearchSettings
                .newBuilder()
                .setEnabled(true)
        )
        .setCalendarSearch(
            Settings.CalendarSearchSettings
                .newBuilder()
                .setEnabled(true)
        )
        .setCalculatorSearch(
            Settings.CalculatorSearchSettings
                .newBuilder()
                .setEnabled(true)
        )
        .setUnitConverterSearch(
            Settings.UnitConverterSearchSettings
                .newBuilder()
                .setEnabled(true)
        )
        .setWikipediaSearch(
            Settings.WikipediaSearchSettings
                .newBuilder()
                .setEnabled(false)
                .setImages(false)
                .setCustomUrl("")
        )
        .setWebsiteSearch(
            Settings.WebsiteSearchSettings
                .newBuilder()
                .setEnabled(false)
        )
        .setWebSearch(
            Settings.WebSearchSettings
                .newBuilder()
                .setEnabled(true)
        )
        .setBadges(
            Settings.BadgeSettings
                .newBuilder()
                .setNotifications(true)
                .setCloudFiles(true)
                .setShortcuts(true)
                .setSuspendedApps(true)
        )
        .setGrid(
            Settings.GridSettings.newBuilder()
                .setColumnCount(context.resources.getInteger(R.integer.config_columnCount))
                .build()
        )
        .setSearchBar(
            Settings.SearchBarSettings.newBuilder()
                .setSearchBarStyle(Settings.SearchBarSettings.SearchBarStyle.Transparent)
                .build()
        )
        .build()
}