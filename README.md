# Adventure Escape SA

An Android app for **Adventure Escape SA**, a company offering professionally guided outdoor adventures for individuals, families, schools, tourists and corporate groups across South Africa. Users can browse adventure packages and individual activities, calculate booking fees, and send an enquiry.

Built in **Kotlin** with XML layouts for the Work Integrated Learning module.

## Group members

| Name | Student number |
|------|----------------|
|      |                |
|      |                |
|      |                |

## Features

- **Home** – welcome screen with navigation to every section, plus a menu on every screen
- **About Us** – company background and information
- **Overview** – all adventure packages and individual activities in one place
- **Adventure packages** (R1 500 each)
  - Ultimate Adventure Day
  - Family Explorer Package
  - Mountain Adventure Package
  - Corporate Team Challenge
- **Individual activities** (R750 each)
  - Ziplining Adventure
  - Kayaking Experience
  - Rock Climbing Session
- **Fee calculator** – select adventures and get a quote with discounts and VAT
- **Contact** – enquiry form (name, email, message)
- **Booking confirmation** – summary after a booking

### Fee calculation

| Adventures selected | Discount |
|---------------------|----------|
| 1                   | none     |
| 2                   | 5%       |
| 3                   | 10%      |
| More than 3         | 15%      |

15% VAT is added after the discount.

## Responsive design

The app displays correctly on different phones, tablets and orientations:

- **System bars and notches** – on Android 15 and later, apps draw behind the status and navigation bars. `ResponsiveWindow.kt` adds `setupResponsiveWindow()`, called in every screen, which pads the content to fit each device's status bar, navigation bar, camera cutout and on-screen keyboard.
- **Adaptive sizes** – button widths and image heights come from dimension resources, so Android picks the right size per device:
  - `values/dimens.xml` – phones in portrait
  - `values-land/dimens.xml` – phones in landscape (shorter images)
  - `values-sw600dp/dimens.xml` – tablets and large foldables (wider buttons, taller images)
- **Large text support** – headers and buttons grow with the user's font size setting instead of cutting text off.
- **Accessible touch targets** – all buttons are at least 48dp tall.
- **Consistent theme** – a light theme keeps text readable when the phone is in dark mode.

## Requirements

- Android Studio (latest stable)
- Minimum SDK: 24 (Android 7.0)
- Target SDK: 36

## How to run

1. Clone the repository:
   ```
   git clone https://github.com/ST10476655/AdventureEscapeSA.git
   ```
2. Open the project folder in Android Studio.
3. Wait for Gradle to sync.
4. Run the app on an emulator or a physical Android device.

## Project structure

```
app/src/main/
├── java/com/example/adventureescapesa/
│   ├── HomeActivity.kt               # Launch screen
│   ├── AboutActivity.kt
│   ├── OverviewActivity.kt
│   ├── UltimateAdventureActivity.kt
│   ├── FamilyExplorerActivity.kt
│   ├── MountainAdventureActivity.kt
│   ├── CorporateChallengeActivity.kt
│   ├── ZipliningActivity.kt
│   ├── KayakingActivity.kt
│   ├── RockClimbingActivity.kt
│   ├── FeeCalculatorActivity.kt
│   ├── ContactActivity.kt
│   ├── BookingConfirmationActivity.kt
│   └── ResponsiveWindow.kt           # Fits content to any device
└── res/
    ├── layout/                       # One XML layout per screen
    ├── values/                       # Strings, colours, themes, phone sizes
    ├── values-land/                  # Landscape sizes
    └── values-sw600dp/               # Tablet sizes
```
