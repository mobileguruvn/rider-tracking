# rider-tracking

This is the **real-time tracking module** for the Rider Tracker Android app, structured with **Clean Architecture** and modularized for enterprise use.

## 🔍 What It Includes

- `tracking-contract`: declares tracking interfaces and navigation entry
- `tracking-impl`: implements GPS tracking screen and logic
- Google Maps & location tracking setup (in progress)

## 💡 Highlights

- Owned by the **tracking feature team**
- Supports live GPS updates via `TrackingRepository`
- Modular and versioned for isolated development

## 📦 Versioning

Each module is published separately to GitHub Maven:


## 🧭 Navigation Entry

Injected through `TrackingNavigator`, supports composable-based routing.

---

Part of the [Rider Tracker Project](https://github.com/mobileguruvn/android-clean-architecture-multi-repo).
