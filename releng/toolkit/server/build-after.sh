#--------------------------------------------------------------------------------
# Copyright (c) 2012-2016 CEA LIST, and others.
#
#    
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#    Nicolas Bros (Mia-Software)
#	 Camille Letavernier (CEA LIST)
#    Dave Carlson (Clinical Cloud Solutions, LLC) -- modify for MDHT
#--------------------------------------------------------------------------------

########## publishing ##########

##
## Known variables:
## BUILD_ID=2014-10-01_05-16-17
##
## For stable builds:
## BUILD_ALIAS=M4
##

p2UpdateSiteDir=${WORKSPACE}/releng/p2-site/target/repository
updateSite=${WORKSPACE}/repository

if [ -n "$BUILD_ALIAS" ]; then
  buildType=S
else
  buildType=N
fi

COMPACT_BUILD_ID="${BUILD_ID//[-_]}"
COMPACT_BUILD_ID="${COMPACT_BUILD_ID:0:12}"
FULL_BUILD_ID=${buildType}${COMPACT_BUILD_ID}

if [ -n "$BUILD_ALIAS" ]; then
  updateZipName=MDHT-Update-${BUILD_ALIAS}.zip
else
  updateZipName=MDHT-Update-${FULL_BUILD_ID}.zip
fi
zipName="MDHT.zip"

rm -rf tmp
mkdir -p "tmp/$FULL_BUILD_ID"

rm -rf $updateSite
mv $p2UpdateSiteDir $updateSite

# create the update site zip
(cd $updateSite && zip -r $updateZipName *)

mv $updateSite/$updateZipName .

#mv $updateSite/$updateZipName "tmp/$FULL_BUILD_ID"

#(cd tmp && zip -r $zipName *)
#mv tmp/$zipName .
