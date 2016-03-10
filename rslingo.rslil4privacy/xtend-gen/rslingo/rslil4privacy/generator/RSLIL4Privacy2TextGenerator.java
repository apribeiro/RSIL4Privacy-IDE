package rslingo.rslil4privacy.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import rslingo.rslil4privacy.rSLIL4Privacy.Attribute;
import rslingo.rslil4privacy.rSLIL4Privacy.Collection;
import rslingo.rslil4privacy.rSLIL4Privacy.Disclosure;
import rslingo.rslil4privacy.rSLIL4Privacy.Enforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Informative;
import rslingo.rslil4privacy.rSLIL4Privacy.Partof;
import rslingo.rslil4privacy.rSLIL4Privacy.Policy;
import rslingo.rslil4privacy.rSLIL4Privacy.PrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.Recipient;
import rslingo.rslil4privacy.rSLIL4Privacy.RefPrivateData;
import rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipientTarget;
import rslingo.rslil4privacy.rSLIL4Privacy.ReferToService;
import rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RSLIL4Privacy2TextGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".txt");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Policy> _filter = Iterators.<Policy>filter(_allContents, Policy.class);
    final Function1<Policy, CharSequence> _function = (Policy it) -> {
      return this.compilepo(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<Policy, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, "\r\n\r\n");
    fsa.generateFile(_plus, _join);
  }
  
  public String className(final Resource res) {
    URI _uRI = res.getURI();
    String name = _uRI.lastSegment();
    int _indexOf = name.indexOf(".");
    return name.substring(0, _indexOf);
  }
  
  public CharSequence compilepo(final Policy policy) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = policy.getName();
    _builder.append(_name, "");
    _builder.append(" Privacy Policy");
    _builder.newLineIfNotEmpty();
    _builder.append("----------------------------------------");
    _builder.newLine();
    {
      EList<Enforcement> _enforcement = policy.getEnforcement();
      boolean _isEmpty = _enforcement.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLine();
        _builder.append("#Enforcement ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Enforcement> _enforcement_1 = policy.getEnforcement();
          for(final Enforcement x : _enforcement_1) {
            CharSequence _compileEn = this.compileEn(x);
            _builder.append(_compileEn, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Service> _service = policy.getService();
      boolean _isEmpty_1 = _service.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.newLine();
        _builder.append("#Service ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Service> _service_1 = policy.getService();
          for(final Service x_1 : _service_1) {
            CharSequence _compileSer = this.compileSer(x_1);
            _builder.append(_compileSer, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Recipient> _recipient = policy.getRecipient();
      boolean _isEmpty_2 = _recipient.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.newLine();
        _builder.append("#Recipients ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Recipient> _recipient_1 = policy.getRecipient();
          for(final Recipient x_2 : _recipient_1) {
            CharSequence _compileRec = this.compileRec(x_2);
            _builder.append(_compileRec, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<PrivateData> _privateData = policy.getPrivateData();
      boolean _isEmpty_3 = _privateData.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.newLine();
        _builder.append("#PrivateData ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<PrivateData> _privateData_1 = policy.getPrivateData();
          for(final PrivateData x_3 : _privateData_1) {
            CharSequence _compilePr = this.compilePr(x_3);
            _builder.append(_compilePr, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Collection> _collection = policy.getCollection();
      boolean _isEmpty_4 = _collection.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.newLine();
        _builder.append("#Collection ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Collection> _collection_1 = policy.getCollection();
          for(final Collection x_4 : _collection_1) {
            CharSequence _compilecol = this.compilecol(x_4);
            _builder.append(_compilecol, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Disclosure> _disclosure = policy.getDisclosure();
      boolean _isEmpty_5 = _disclosure.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.newLine();
        _builder.append("#Disclosure ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Disclosure> _disclosure_1 = policy.getDisclosure();
          for(final Disclosure x_5 : _disclosure_1) {
            CharSequence _compiledis = this.compiledis(x_5);
            _builder.append(_compiledis, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Retention> _retention = policy.getRetention();
      boolean _isEmpty_6 = _retention.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        _builder.newLine();
        _builder.append("#Retention ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Retention> _retention_1 = policy.getRetention();
          for(final Retention x_6 : _retention_1) {
            CharSequence _compileret = this.compileret(x_6);
            _builder.append(_compileret, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Usage> _usage = policy.getUsage();
      boolean _isEmpty_7 = _usage.isEmpty();
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        _builder.newLine();
        _builder.append("#Usage ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Usage> _usage_1 = policy.getUsage();
          for(final Usage x_7 : _usage_1) {
            CharSequence _compileuset = this.compileuset(x_7);
            _builder.append(_compileuset, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<Informative> _informative = policy.getInformative();
      boolean _isEmpty_8 = _informative.isEmpty();
      boolean _not_8 = (!_isEmpty_8);
      if (_not_8) {
        _builder.newLine();
        _builder.append("#Informative ");
        _builder.newLine();
        _builder.append("------------------");
        _builder.newLine();
        {
          EList<Informative> _informative_1 = policy.getInformative();
          for(final Informative x_8 : _informative_1) {
            CharSequence _compileinf = this.compileinf(x_8);
            _builder.append(_compileinf, "");
          }
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileEn(final Enforcement En) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = En.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _enforcementName = En.getEnforcementName();
    _builder.append(_enforcementName, "");
    _builder.append("(");
    String _enforcementKind = En.getEnforcementKind();
    _builder.append(_enforcementKind, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    String _enforcementDescription = En.getEnforcementDescription();
    _builder.append(_enforcementDescription, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileSer(final Service se) {
    StringConcatenation _builder = new StringConcatenation();
    String _servicename = se.getServicename();
    _builder.append(_servicename, "");
    _builder.append(":");
    String _description = se.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<ServicePartof> _servicepartof = se.getServicepartof();
      boolean _isEmpty = _servicepartof.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Service_Part:");
        {
          EList<ServicePartof> _servicepartof_1 = se.getServicepartof();
          boolean _hasElements = false;
          for(final ServicePartof part : _servicepartof_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compilerespart = this.compilerespart(part);
            _builder.append(_compilerespart, "\t");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<RefPrivateData> _refprivatedata = se.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refprivatedata_1 = se.getRefprivatedata();
          boolean _hasElements_1 = false;
          for(final RefPrivateData part_1 : _refprivatedata_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t");
            }
            CharSequence _compilerrefp = this.compilerrefp(part_1);
            _builder.append(_compilerrefp, "\t");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileRec(final Recipient r) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = r.getName();
    _builder.append(_name, "");
    _builder.append(".");
    String _recipientname = r.getRecipientname();
    _builder.append(_recipientname, "");
    _builder.append("(");
    String _recipientScopeKind = r.getRecipientScopeKind();
    _builder.append(_recipientScopeKind, "");
    _builder.append("-");
    String _recipientTypeKind = r.getRecipientTypeKind();
    _builder.append(_recipientTypeKind, "");
    _builder.append("):");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    String _description = r.getDescription();
    _builder.append(_description, "   ");
    _builder.append(", ");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    {
      EList<Partof> _partof = r.getPartof();
      boolean _isEmpty = _partof.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Recipient_Part:");
        {
          EList<Partof> _partof_1 = r.getPartof();
          boolean _hasElements = false;
          for(final Partof part : _partof_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "   ");
            }
            CharSequence _compilepart = this.compilepart(part);
            _builder.append(_compilepart, "   ");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilePr(final PrivateData e) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = e.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _privateDataKind = e.getPrivateDataKind();
    _builder.append(_privateDataKind, "");
    _builder.append("): ");
    String _privatedata = e.getPrivatedata();
    _builder.append(_privatedata, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Attribute:");
    {
      EList<Attribute> _attribute = e.getAttribute();
      boolean _hasElements = false;
      for(final Attribute a : _attribute) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        CharSequence _compile = this.compile(a);
        _builder.append(_compile, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _attributeName = a.getAttributeName();
    _builder.append(_attributeName, "");
    _builder.append(")");
    return _builder;
  }
  
  public CharSequence compilecol(final Collection col) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = col.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modalitykind = col.getModalitykind();
    _builder.append(_modalitykind, "");
    _builder.append("):");
    String _description = col.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<ReferToService> _refertoservice = col.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<ReferToService> _refertoservice_1 = col.getRefertoservice();
          boolean _hasElements = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerespart = this.compilerespart(b);
            _builder.append(_compilerespart, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refprivatedata = col.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refprivatedata_1 = col.getRefprivatedata();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerrefp = this.compilerrefp(p);
            _builder.append(_compilerrefp, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefertoEnforcement> _refertoEnforcement = col.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = col.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement p_1 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerreEn = this.compilerreEn(p_1);
            _builder.append(_compilerreEn, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compiledis(final Disclosure dis) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = dis.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modalitykind = dis.getModalitykind();
    _builder.append(_modalitykind, "");
    _builder.append("):");
    String _description = dis.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<ReferToRecipientTarget> _referToRecipienttarget = dis.getReferToRecipienttarget();
      boolean _isEmpty = _referToRecipienttarget.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Recipient:");
        {
          EList<ReferToRecipientTarget> _referToRecipienttarget_1 = dis.getReferToRecipienttarget();
          boolean _hasElements = false;
          for(final ReferToRecipientTarget p : _referToRecipienttarget_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compileres = this.compileres(p);
            _builder.append(_compileres, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<ReferToService> _refertoservice = dis.getRefertoservice();
      boolean _isEmpty_1 = _refertoservice.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To Service:");
        {
          EList<ReferToService> _refertoservice_1 = dis.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerespart = this.compilerespart(b);
            _builder.append(_compilerespart, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refprivatedata = dis.getRefprivatedata();
      boolean _isEmpty_2 = _refprivatedata.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refprivatedata_1 = dis.getRefprivatedata();
          boolean _hasElements_2 = false;
          for(final RefPrivateData p_1 : _refprivatedata_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerrefp = this.compilerrefp(p_1);
            _builder.append(_compilerrefp, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefertoEnforcement> _refertoEnforcement = dis.getRefertoEnforcement();
      boolean _isEmpty_3 = _refertoEnforcement.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = dis.getRefertoEnforcement();
          boolean _hasElements_3 = false;
          for(final RefertoEnforcement d : _refertoEnforcement_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerreEn = this.compilerreEn(d);
            _builder.append(_compilerreEn, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileret(final Retention ret) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = ret.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modalitykind = ret.getModalitykind();
    _builder.append(_modalitykind, "");
    _builder.append("-");
    String _period = ret.getPeriod();
    _builder.append(_period, "");
    _builder.append("):");
    String _description = ret.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<ReferToService> _refertoservice = ret.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<ReferToService> _refertoservice_1 = ret.getRefertoservice();
          boolean _hasElements = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerespart = this.compilerespart(b);
            _builder.append(_compilerespart, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refprivatedata = ret.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refprivatedata_1 = ret.getRefprivatedata();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerrefp = this.compilerrefp(p);
            _builder.append(_compilerrefp, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefertoEnforcement> _refertoEnforcement = ret.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = ret.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement p_1 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerreEn = this.compilerreEn(p_1);
            _builder.append(_compilerreEn, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileuset(final Usage u) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = u.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modalitykind = u.getModalitykind();
    _builder.append(_modalitykind, "");
    _builder.append("):");
    String _description = u.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<ReferToService> _refertoservice = u.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<ReferToService> _refertoservice_1 = u.getRefertoservice();
          boolean _hasElements = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerespart = this.compilerespart(b);
            _builder.append(_compilerespart, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refprivatedata = u.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refprivatedata_1 = u.getRefprivatedata();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerrefp = this.compilerrefp(p);
            _builder.append(_compilerrefp, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefertoEnforcement> _refertoEnforcement = u.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = u.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement p_1 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerreEn = this.compilerreEn(p_1);
            _builder.append(_compilerreEn, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileinf(final Informative I) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = I.getName();
    _builder.append(_name, "");
    _builder.append("(");
    String _modalitykind = I.getModalitykind();
    _builder.append(_modalitykind, "");
    _builder.append("):");
    String _description = I.getDescription();
    _builder.append(_description, "");
    _builder.append(",");
    _builder.newLineIfNotEmpty();
    {
      EList<ReferToService> _refertoservice = I.getRefertoservice();
      boolean _isEmpty = _refertoservice.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("Refers To Service:");
        {
          EList<ReferToService> _refertoservice_1 = I.getRefertoservice();
          boolean _hasElements = false;
          for(final ReferToService b : _refertoservice_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerespart = this.compilerespart(b);
            _builder.append(_compilerespart, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefPrivateData> _refprivatedata = I.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("Refers To PrivateData:");
        {
          EList<RefPrivateData> _refprivatedata_1 = I.getRefprivatedata();
          boolean _hasElements_1 = false;
          for(final RefPrivateData p : _refprivatedata_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerrefp = this.compilerrefp(p);
            _builder.append(_compilerrefp, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EList<RefertoEnforcement> _refertoEnforcement = I.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("Refers To Enforcement:");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = I.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement p_1 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _compilerreEn = this.compilerreEn(p_1);
            _builder.append(_compilerreEn, "");
          }
        }
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compilepe(final Retention pe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   ");
    _builder.append("Retention Period:");
    String _period = pe.getPeriod();
    _builder.append(_period, "   ");
    return _builder;
  }
  
  public CharSequence compileres(final ReferToRecipientTarget r) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _refertore = r.getRefertore();
    String _name = _refertore.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compilerespart(final ReferToService sp) {
    StringConcatenation _builder = new StringConcatenation();
    Service _refertose = sp.getRefertose();
    String _name = _refertose.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compilerespart(final ServicePartof sp) {
    StringConcatenation _builder = new StringConcatenation();
    Service _refertoservice = sp.getRefertoservice();
    String _name = _refertoservice.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compilerrefp(final RefPrivateData pp) {
    StringConcatenation _builder = new StringConcatenation();
    PrivateData _refpr = pp.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compilepart(final Partof part) {
    StringConcatenation _builder = new StringConcatenation();
    Recipient _partof = part.getPartof();
    String _name = _partof.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public CharSequence compilerreEn(final RefertoEnforcement en) {
    StringConcatenation _builder = new StringConcatenation();
    Enforcement _refst = en.getRefst();
    String _name = _refst.getName();
    _builder.append(_name, "");
    return _builder;
  }
}
