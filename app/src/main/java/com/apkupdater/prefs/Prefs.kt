package com.apkupdater.prefs

import com.kryptoprefs.context.KryptoContext
import com.kryptoprefs.gson.json
import com.kryptoprefs.preferences.KryptoPrefs


class Prefs(prefs: KryptoPrefs): KryptoContext(prefs) {
	val ignoredApps = json("ignoredApps", emptyList<String>(), true)
	val excludeSystem = boolean("excludeSystem", defValue = true, backed = true)
	val excludeDisabled = boolean("excludeDisabled", defValue = true, backed = true)
	val excludeStore = boolean("excludeStore", defValue = false, backed = true)
	val portraitColumns  = int("portraitColumns", 2, true)
	val landscapeColumns  = int("landscapeColumns", 4, true)
	val ignoreAlpha = boolean("ignoreAlpha", defValue = true, backed = true)
	val ignoreBeta = boolean("ignoreBeta", defValue = true, backed = true)
}
