# rider-trip

This is the **trip management module** for the Rider Tracker Android application, designed with **Clean Architecture** and optimized for **modular team-based development**.

## 🔍 What It Includes

- `trip-contract`: defines trip data contracts and navigation interfaces
- `trip-impl`: provides UI, ViewModel, and business logic for listing rider trips
- Published to Maven for consumption in the main app

## 💡 Highlights

- Owned by the **trip feature team**
- Communicates only through contracts (`TripRepository`, `TripNavigator`)
- Fully decoupled for scalability and independent versioning

## 📦 Versioning

Each module is versioned independently and published to GitHub Packages:


## 🧭 Navigation Entry

Expose composable destinations via `TripNavigator`.

---

Part of the [Rider Tracker Project](https://github.com/mobileguruvn/android-clean-architecture-multi-repo).
