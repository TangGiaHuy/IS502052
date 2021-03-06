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
package edu.tdt.polymorphism;

/**
 *
 * @author Kelvin
 */
public class Motorbike implements Vehicle {
    
    private int wheel;
    
    public Motorbike()
    {
        this.wheel = 0;
    }
    
    public Motorbike(int wheel)
    {
        this.wheel = wheel;
    }
    
    public Motorbike(Motorbike m)
    {
        this.wheel = m.wheel;
    }

    @Override
    public void run()
    {
        System.out.println("Motorbike has " + this.wheel + " wheels. Run!");
    }
    
}
