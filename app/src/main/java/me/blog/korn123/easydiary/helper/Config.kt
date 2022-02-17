package me.blog.korn123.easydiary.helper

import android.content.Context
import androidx.preference.PreferenceManager
import io.github.aafactory.commons.helpers.*
import io.github.aafactory.commons.utils.CommonUtils

/**
 * Created by CHO HANJOONG on 2017-12-24.
 * This code based 'Simple-Commons' package
 * You can see original 'Simple-Commons' from below link.
 * https://github.com/SimpleMobileTools/Simple-Commons
 */

class Config(context: Context) : com.simplemobiletools.commons.helpers.BaseConfig(context) {
    private val legacyPrefs = PreferenceManager.getDefaultSharedPreferences(context)!!


    /// ------------------------------------------------------------------
    /// Awesome Application Factory legacy properties
    /// ------------------------------------------------------------------
    var aafPatternLockProtectionOn: Boolean
        get() = prefs.getBoolean(AAF_PATTERN_LOCK_PROTECTION_ON, false)
        set(appPasswordProtectionOn) = prefs.edit().putBoolean(AAF_PATTERN_LOCK_PROTECTION_ON, appPasswordProtectionOn).apply()

    var aafPatternLockPauseMillis: Long
        get() = prefs.getLong(AAF_PATTERN_LOCK_PAUSE_MILLIS, 0L)
        set(aafPatternLockPauseMillis) = prefs.edit().putLong(AAF_PATTERN_LOCK_PAUSE_MILLIS, aafPatternLockPauseMillis).apply()

    var aafPatternLockSaved: String
        get() = legacyPrefs.getString(AAF_PATTERN_LOCK_SAVED, AAF_PATTERN_LOCK_DEFAULT)!!
        set(aafPatternLockSaved) = legacyPrefs.edit().putString(AAF_PATTERN_LOCK_SAVED, aafPatternLockSaved).apply()

    var aafPinLockPauseMillis: Long
        get() = prefs.getLong(AAF_PIN_LOCK_PAUSE_MILLIS, 0L)
        set(aafPinLockPauseMillis) = prefs.edit().putLong(AAF_PIN_LOCK_PAUSE_MILLIS, aafPinLockPauseMillis).apply()

    var isThemeChanged: Boolean
        get() = prefs.getBoolean(AAF_THEME_CHANGE, false)
        set(isThemeChanged) = prefs.edit().putBoolean(AAF_THEME_CHANGE, isThemeChanged).apply()


    /// ------------------------------------------------------------------
    /// Easy Diary properties
    /// ------------------------------------------------------------------
    var settingFontName: String
        get() = legacyPrefs.getString(SETTING_FONT_NAME, CUSTOM_FONTS_SUPPORTED_LANGUAGE_DEFAULT)!!
        set(settingFontName) = legacyPrefs.edit().putString(SETTING_FONT_NAME, settingFontName).apply()

    var aafPinLockSavedPassword: String
        get() = legacyPrefs.getString(APP_LOCK_SAVED_PASSWORD, APP_LOCK_DEFAULT_PASSWORD)!!
        set(aafPinLockSavedPassword) = legacyPrefs.edit().putString(APP_LOCK_SAVED_PASSWORD, aafPinLockSavedPassword).apply()

    var previousActivity: Int
        get() = legacyPrefs.getInt(PREVIOUS_ACTIVITY, -1)
        set(previousActivity) = legacyPrefs.edit().putInt(PREVIOUS_ACTIVITY, previousActivity).apply()
    
    var settingFontSize: Float
        get() = legacyPrefs.getFloat(SETTING_FONT_SIZE, CommonUtils.dpToPixelFloatValue(context, DEFAULT_FONT_SIZE_SUPPORT_LANGUAGE.toFloat()))
        set(settingFontSize) = legacyPrefs.edit().putFloat(SETTING_FONT_SIZE, settingFontSize).apply()

    var diarySearchQueryCaseSensitive: Boolean
        get() = legacyPrefs.getBoolean(DIARY_SEARCH_QUERY_CASE_SENSITIVE, false)
        set(diarySearchQueryCaseSensitive) = legacyPrefs.edit().putBoolean(DIARY_SEARCH_QUERY_CASE_SENSITIVE, diarySearchQueryCaseSensitive).apply()

    var aafPinLockEnable: Boolean
        get() = legacyPrefs.getBoolean(APP_LOCK_ENABLE, false)
        set(aafPinLockEnable) = legacyPrefs.edit().putBoolean(APP_LOCK_ENABLE, aafPinLockEnable).apply()

    var isInitDummyData: Boolean
        get() = legacyPrefs.getBoolean(INIT_DUMMY_DATA_FLAG, false)
        set(isInitDummyData) = legacyPrefs.edit().putBoolean(INIT_DUMMY_DATA_FLAG, isInitDummyData).apply()

    var lineSpacingScaleFactor: Float
        get() = legacyPrefs.getFloat(LINE_SPACING_SCALE_FACTOR, LINE_SPACING_SCALE_DEFAULT)
        set(lineSpacingScaleFactor) = legacyPrefs.edit().putFloat(LINE_SPACING_SCALE_FACTOR, lineSpacingScaleFactor).apply()

    var settingThumbnailSize: Float
        get() = prefs.getFloat(SETTING_THUMBNAIL_SIZE, DEFAULT_THUMBNAIL_SIZE_DP.toFloat())
        set(settingThumbnailSize) = prefs.edit().putFloat(SETTING_THUMBNAIL_SIZE, settingThumbnailSize).apply()

    var settingCalendarFontScale: Float
        get() = prefs.getFloat(SETTING_CALENDAR_FONT_SCALE, DEFAULT_CALENDAR_FONT_SCALE.toFloat())
        set(calendarFontScale) = prefs.edit().putFloat(SETTING_CALENDAR_FONT_SCALE, calendarFontScale).apply()

    var boldStyleEnable: Boolean
        get() = prefs.getBoolean(SETTING_BOLD_STYLE, false)
        set(boldStyleEnable) = prefs.edit().putBoolean(SETTING_BOLD_STYLE, boldStyleEnable).apply()
    
    var multiPickerEnable: Boolean
        get() = prefs.getBoolean(SETTING_MULTIPLE_PICKER, false)
        set(multiPickerEnable) = prefs.edit().putBoolean(SETTING_MULTIPLE_PICKER, multiPickerEnable).apply()

    var fingerprintLockEnable: Boolean
        get() = prefs.getBoolean(SETTING_FINGERPRINT_LOCK, false)
        set(fingerprintLockEnable) = prefs.edit().putBoolean(SETTING_FINGERPRINT_LOCK, fingerprintLockEnable).apply()

    var fingerprintEncryptData: String
        get() = prefs.getString(FINGERPRINT_ENCRYPT_DATA, "") ?: ""
        set(fingerprintEncryptData) = prefs.edit().putString(FINGERPRINT_ENCRYPT_DATA, fingerprintEncryptData).apply()

    var fingerprintEncryptDataIV: String
        get() = prefs.getString(FINGERPRINT_ENCRYPT_DATA_IV, "") ?: ""
        set(fingerprintEncryptDataIV) = prefs.edit().putString(FINGERPRINT_ENCRYPT_DATA_IV, fingerprintEncryptDataIV).apply()

    var fingerprintAuthenticationFailCount: Int
        get() = prefs.getInt(FINGERPRINT_AUTHENTICATION_FAIL_COUNT, 0)
        set(fingerprintAuthenticationFailCount) = prefs.edit().putInt(FINGERPRINT_AUTHENTICATION_FAIL_COUNT, fingerprintAuthenticationFailCount).apply()

    var enableCardViewPolicy: Boolean
        get() = prefs.getBoolean(ENABLE_CARD_VIEW_POLICY, true)
        set(enableCardViewPolicy) = prefs.edit().putBoolean(ENABLE_CARD_VIEW_POLICY, enableCardViewPolicy).apply()
    
    var enableContentsSummary: Boolean
        get() = prefs.getBoolean(SETTING_CONTENTS_SUMMARY, true)
        set(enableContentsSummary) = prefs.edit().putBoolean(SETTING_CONTENTS_SUMMARY, enableContentsSummary).apply()

    var postCardCropMode: Int
        get() = prefs.getInt(POSTCARD_CROP_MODE, 0)
        set(postCardCropMode) = prefs.edit().putInt(POSTCARD_CROP_MODE, postCardCropMode).apply()

    var clearLegacyToken: Boolean
        get() = prefs.getBoolean(SETTING_CLEAR_LEGACY_TOKEN, false)
        set(clearLegacyToken) = prefs.edit().putBoolean(SETTING_CLEAR_LEGACY_TOKEN, clearLegacyToken).apply()

    var calendarStartDay: Int
        get() = prefs.getInt(SETTING_CALENDAR_START_DAY, CALENDAR_START_DAY_SUNDAY)
        set(calendarStartDay) = prefs.edit().putInt(SETTING_CALENDAR_START_DAY, calendarStartDay).apply()

    var enableCountCharacters: Boolean
        get() = prefs.getBoolean(SETTING_COUNT_CHARACTERS, false)
        set(enableCountCharacters) = prefs.edit().putBoolean(SETTING_COUNT_CHARACTERS, enableCountCharacters).apply()

    var diaryBackupGoogle: Long
        get() = prefs.getLong(DIARY_LAST_BACKUP_TIMESTAMP_GOOGLE_DRIVE, 0)
        set(diaryBackupGoogle) = prefs.edit().putLong(DIARY_LAST_BACKUP_TIMESTAMP_GOOGLE_DRIVE, diaryBackupGoogle).apply()

    var photoBackupGoogle: Long
        get() = prefs.getLong(PHOTO_LAST_BACKUP_TIMESTAMP_GOOGLE_DRIVE, 0)
        set(photoBackupGoogle) = prefs.edit().putLong(PHOTO_LAST_BACKUP_TIMESTAMP_GOOGLE_DRIVE, photoBackupGoogle).apply()

    var diaryBackupLocal: Long
        get() = prefs.getLong(DIARY_LAST_BACKUP_TIMESTAMP_LOCAL, 0)
        set(diaryBackupLocal) = prefs.edit().putLong(DIARY_LAST_BACKUP_TIMESTAMP_LOCAL, diaryBackupLocal).apply()

    var calendarSorting: Int
        get() = prefs.getInt(SETTING_CALENDAR_SORTING, CALENDAR_SORTING_DESC)
        set(calendarSorting) = prefs.edit().putInt(SETTING_CALENDAR_SORTING, calendarSorting).apply()

    var updatePreference: Boolean
        get() = prefs.getBoolean(UPDATE_SHARED_PREFERENCE, false)
        set(updatePreference) = prefs.edit().putBoolean(UPDATE_SHARED_PREFERENCE, updatePreference).apply()

    var holdPositionEnterEditScreen: Boolean
        get() = prefs.getBoolean(HOLD_POSITION_ENTER_EDIT_SCREEN, false)
        set(holdPositionEnterEditScreen) = prefs.edit().putBoolean(HOLD_POSITION_ENTER_EDIT_SCREEN, holdPositionEnterEditScreen).apply()

    var summaryMaxLines: Int
        get() = prefs.getInt(SETTING_SUMMARY_MAX_LINES, SETTING_SUMMARY_MAX_LINES_DEFAULT)
        set(summaryMaxLines) = prefs.edit().putInt(SETTING_SUMMARY_MAX_LINES, summaryMaxLines).apply()

    var enableDebugMode: Boolean
        get() = prefs.getBoolean(SETTING_ENABLE_DEBUG_CONSOLE, false)
        set(enableDebugMode) = prefs.edit().putBoolean(SETTING_ENABLE_DEBUG_CONSOLE, enableDebugMode).apply()

    var enableLocationInfo: Boolean
        get() = prefs.getBoolean(SETTING_LOCATION_INFO, false)
        set(enableLocationInfo) = prefs.edit().putBoolean(SETTING_LOCATION_INFO, enableLocationInfo).apply()

    var enableTaskSymbolTopOrder: Boolean
        get() = prefs.getBoolean(SETTING_TASK_SYMBOL_TOP_ORDER, false)
        set(enableTaskSymbolTopOrder) = prefs.edit().putBoolean(SETTING_TASK_SYMBOL_TOP_ORDER, enableTaskSymbolTopOrder).apply()

    var selectedSymbols: String
        get() = prefs.getString(SETTING_SELECTED_SYMBOLS, SELECTED_SYMBOLS_DEFAULT)!!
        set(selectedSymbols) = prefs.edit().putString(SETTING_SELECTED_SYMBOLS, selectedSymbols).apply()

    var appExecutionCount: Int
        get() = prefs.getInt(APP_EXECUTION_COUNT, APP_EXECUTION_COUNT_DEFAULT)
        set(appExecutionCount) = prefs.edit().putInt(APP_EXECUTION_COUNT, appExecutionCount).apply()

    var enableReviewFlow: Boolean
        get() = prefs.getBoolean(SETTING_ENABLE_REVIEW_FLOW, true)
        set(enableReviewFlow) = prefs.edit().putBoolean(SETTING_ENABLE_REVIEW_FLOW, enableReviewFlow).apply()

    var postcardSpanCountLandscape: Int
        get() = prefs.getInt(SETTING_POSTCARD_SPAN_COUNT_LANDSCAPE, 5)
        set(postcardSpanCountLandscape) = prefs.edit().putInt(SETTING_POSTCARD_SPAN_COUNT_LANDSCAPE, postcardSpanCountLandscape).apply()

    var postcardSpanCountPortrait: Int
        get() = prefs.getInt(SETTING_POSTCARD_SPAN_COUNT_PORTRAIT, 2)
        set(postcardSpanCountPortrait) = prefs.edit().putInt(SETTING_POSTCARD_SPAN_COUNT_PORTRAIT, postcardSpanCountPortrait).apply()

    var diaryMainSpanCountLandscape: Int
        get() = prefs.getInt(SETTING_DIARY_MAIN_SPAN_COUNT_LANDSCAPE, 1)
        set(diaryMainSpanCountLandscape) = prefs.edit().putInt(SETTING_DIARY_MAIN_SPAN_COUNT_LANDSCAPE, diaryMainSpanCountLandscape).apply()

    var diaryMainSpanCountPortrait: Int
        get() = prefs.getInt(SETTING_DIARY_MAIN_SPAN_COUNT_PORTRAIT, 1)
        set(diaryMainSpanCountPortrait) = prefs.edit().putInt(SETTING_DIARY_MAIN_SPAN_COUNT_PORTRAIT, diaryMainSpanCountPortrait).apply()

    var enablePhotoHighlight: Boolean
        get() = prefs.getBoolean(SETTING_ENABLE_PHOTO_HIGHLIGHT, false)
        set(enablePhotoHighlight) = prefs.edit().putBoolean(SETTING_ENABLE_PHOTO_HIGHLIGHT, enablePhotoHighlight).apply()

    var enableStatusBarDarkenColor: Boolean
        get() = prefs.getBoolean(SETTING_ENABLE_STATUSBAR_DARKEN_COLOR, true)
        set(enableStatusBarDarkenColor) = prefs.edit().putBoolean(SETTING_ENABLE_STATUSBAR_DARKEN_COLOR, enableStatusBarDarkenColor).apply()

    companion object {
        fun newInstance(context: Context) = Config(context)
    }
}