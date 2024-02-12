ApplicationIDentifier (AID)
            RID        |      PIX
coding: D2 76 00 01 24 |      01     |   xx xx  |     xx xx    |  xx xx xx xx  | 00 00 |
length:     5          |      1      |     2    |       2      |       4       |   2   |
Name: RID (ISO 7816-5) | Application |  version | Manufacturer | Serial Number |  RFU  |


xplain:
coding: In hexdicimal
Length: decimal
RID: Registered application provider identifier
PIX: Proprietary application Identidfier extension
application: indication of the application
version: version of the application
Manufacturer: Unique code for the manufacturer if the application (Card)
Serial number: Unique Serial number
RFU: Reserved for future use