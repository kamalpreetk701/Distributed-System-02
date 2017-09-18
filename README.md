# Distributed-System-02

Three record maintaining servers and client architecture implemented using RMI and inter server communication using UDP.

Three different server Montreal (MTL), Laval (LVL) and Dollard-des-Ormeaux (DDO) are implemented using RMI and for each server 
a Udp server is created so that servers can communicate with each other. The server for each center maintains records of two types of TeacherRecord and StudentRecord.A Record on each server can be identified by a unique RecordID .

The Records are created as arraylists in a hash map according to the first letter of the last name indicated in the records
as the key value. Each server also maintains a log containing all the operations that have been performed on that server, at
what time and who performed the operation.

The managers carry with them a log (text file) of the actions they performed on the system and they can perform the following
function:- 1.createSRecord (firstName, lastName, courseRegistered, status, statusDate)

2.getRecordCounts ()

3.editRecord (recordID, fieldName, newValue)

display ()

createTRecord (firstName, lastName, address, phone, specialization, location)

The project contains following files:-(all .java files)

1.ServerInterface- defines the comman interface for all the servers.

2.Server_Imp- class provides implementation of server and extends .

3.Montreal_server,Laval_Server,DDO_server-Three Instances of Server_Imp class.

4.Login- authenticates the user using details from login.txt file.

5.Record-
