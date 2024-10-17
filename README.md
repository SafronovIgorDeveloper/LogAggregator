# LogAggregator

**LogAggregator** is an application that collects logs from multiple sources and displays them in a convenient format.

## Features

- Collect logs from multiple sources
- Consolidate logs in one place
- Support for multiple log formats
- Filter and search through logs
- User-friendly JavaFX interface

## Usage
1. After starting the application, open its interface using JavaFX.
2. Configure log sources through the user interface.
3. Start collecting logs and view them in one place.

## Supported Log Formats

- Plain Text Logs
- JSON Logs

## Example Configurations

```json
{
  "logSources": [
    {
      "type": "remote",
      "protocol": "ssh",
      "address": "192.168.1.10",
      "path": "/var/log/system.log"
    },
    {
      "type": "local",
      "path": "C:\\logs\\application.log"
    },
    {
      "type": "database",
      "connectionString": "jdbc:mysql://localhost:3306/logs",
      "query": "SELECT * FROM log_table"
    }
  ]
}
```