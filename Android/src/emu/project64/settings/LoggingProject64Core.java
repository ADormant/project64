/****************************************************************************
*                                                                           *
* Project64 - A Nintendo 64 emulator.                                       *
* http://www.pj64-emu.com/                                                  *
* Copyright (C) 2012 Project64. All rights reserved.                        *
*                                                                           *
* License:                                                                  *
* GNU/GPLv2 http://www.gnu.org/licenses/gpl-2.0.html                        *
*                                                                           *
****************************************************************************/
package emu.project64.settings;

import emu.project64.R;

public class LoggingProject64Core extends BaseSettingsFragment
{
    @Override
    protected int getXml() 
    {
        return R.xml.logging_project64core;
    }

    @Override
    protected int getTitleId() 
    {
        return R.string.logging_project64core;
    }
}
