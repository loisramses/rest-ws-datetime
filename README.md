# Elastic stack (ELK) on Docker

## tl;dr

```sh
docker-compose build
```

```sh
docker-compose up -d
```

## Contents

1. [Requirements](#requirements)
   * [Host setup](#host-setup)
   * [Docker Desktop](#docker-desktop)
     * [Windows](#windows)
     * [macOS](#macos)

## Requirements

### Host setup

* [Docker Engine][docker-install] version **18.06.0** or newer
* [Docker Compose][compose-install] version **1.28.0** or newer (including [Compose V2][compose-v2])

### Docker Desktop

#### Windows

If you are using the legacy Hyper-V mode of _Docker Desktop for Windows_, ensure [File Sharing][win-filesharing] is
enabled for the `C:` drive.

#### macOS

The default configuration of _Docker Desktop for Mac_ allows mounting files from `/Users/`, `/Volume/`, `/private/`,
`/tmp` and `/var/folders` exclusively. Make sure the repository is cloned in one of those locations or follow the
instructions from the [documentation][mac-filesharing] to add more locations.