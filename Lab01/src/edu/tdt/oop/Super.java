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
package edu.tdt.oop;

/**
 *
 * @author Kelvin
 */
public class Super {
    
    protected int x;
    
    public Super()
    {
        this.x = 0;
    }
    
    public Super(int x)
    {
        this.x = x;
    }
    
    public void display()
    {
        System.out.println("Super Class, x = " + this.x);
    }
    
}
