/*
 * Copyright 2017 Kelvin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.tdt.rmiserver;

import edu.tdt.rmiinterface.*;
import java.rmi.registry.*;

/**
 *
 * @author Kelvin
 */
public class Client {
    
    public Client()
    {
        
    }
    
    public static void main(String[] args)
    {
        try
        {
            // Getting the registry
            Registry registry = LocateRegistry.getRegistry(null);
            
            // Looking up the registry for the remote object
            Hello stub = (Hello) registry.lookup("Hello");
            
            // Calling the remote method using the obtained object
            stub.printMsg("Kelvin");
            
            System.err.println("Remote method invoked");
            
        } catch(Exception e)
        {
            System.err.println(e.toString());
        }
    }
}
