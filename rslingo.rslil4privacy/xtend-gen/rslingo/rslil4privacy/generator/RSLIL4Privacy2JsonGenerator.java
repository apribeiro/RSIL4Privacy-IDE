package rslingo.rslil4privacy.generator;

import com.google.common.base.Objects;
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
import rslingo.rslil4privacy.rSLIL4Privacy.ReferToRecipient;
import rslingo.rslil4privacy.rSLIL4Privacy.ReferToService;
import rslingo.rslil4privacy.rSLIL4Privacy.RefertoEnforcement;
import rslingo.rslil4privacy.rSLIL4Privacy.Retention;
import rslingo.rslil4privacy.rSLIL4Privacy.Service;
import rslingo.rslil4privacy.rSLIL4Privacy.ServicePartof;
import rslingo.rslil4privacy.rSLIL4Privacy.Usage;

@SuppressWarnings("all")
public class RSLIL4Privacy2JsonGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    String _className = this.className(resource);
    String _plus = (_className + ".json");
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Policy> _filter = Iterators.<Policy>filter(_allContents, Policy.class);
    final Function1<Policy, CharSequence> _function = (Policy it) -> {
      return this.compilepo(it);
    };
    Iterator<CharSequence> _map = IteratorExtensions.<Policy, CharSequence>map(_filter, _function);
    String _join = IteratorExtensions.join(_map, "\r\n");
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
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"name\": \"");
    String _name = policy.getName();
    _builder.append(_name, "\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      EList<Collection> _collection = policy.getCollection();
      boolean _isEmpty = _collection.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Collections\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Collection> _collection_1 = policy.getCollection();
          boolean _hasElements = false;
          for(final Collection c : _collection_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileCollection = this.compileCollection(c);
            _builder.append(_compileCollection, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Disclosure> _disclosure = policy.getDisclosure();
      boolean _isEmpty_1 = _disclosure.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Disclosure\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Disclosure> _disclosure_1 = policy.getDisclosure();
          boolean _hasElements_1 = false;
          for(final Disclosure d : _disclosure_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileDisclosure = this.compileDisclosure(d);
            _builder.append(_compileDisclosure, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Retention> _retention = policy.getRetention();
      boolean _isEmpty_2 = _retention.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Retention\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Retention> _retention_1 = policy.getRetention();
          boolean _hasElements_2 = false;
          for(final Retention d_1 : _retention_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileRetention = this.compileRetention(d_1);
            _builder.append(_compileRetention, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Usage> _usage = policy.getUsage();
      boolean _isEmpty_3 = _usage.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Usage\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Usage> _usage_1 = policy.getUsage();
          boolean _hasElements_3 = false;
          for(final Usage d_2 : _usage_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileUsage = this.compileUsage(d_2);
            _builder.append(_compileUsage, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Informative> _informative = policy.getInformative();
      boolean _isEmpty_4 = _informative.isEmpty();
      boolean _not_4 = (!_isEmpty_4);
      if (_not_4) {
        _builder.append("\"Informative\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Informative> _informative_1 = policy.getInformative();
          boolean _hasElements_4 = false;
          for(final Informative d_3 : _informative_1) {
            if (!_hasElements_4) {
              _hasElements_4 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileInformative = this.compileInformative(d_3);
            _builder.append(_compileInformative, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<PrivateData> _privateData = policy.getPrivateData();
      boolean _isEmpty_5 = _privateData.isEmpty();
      boolean _not_5 = (!_isEmpty_5);
      if (_not_5) {
        _builder.append(" \"PrivateDatums\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<PrivateData> _privateData_1 = policy.getPrivateData();
          boolean _hasElements_5 = false;
          for(final PrivateData z : _privateData_1) {
            if (!_hasElements_5) {
              _hasElements_5 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compilePrivateData = this.compilePrivateData(z);
            _builder.append(_compilePrivateData, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Recipient> _recipient = policy.getRecipient();
      boolean _isEmpty_6 = _recipient.isEmpty();
      boolean _not_6 = (!_isEmpty_6);
      if (_not_6) {
        _builder.append(" \"Recipients\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Recipient> _recipient_1 = policy.getRecipient();
          boolean _hasElements_6 = false;
          for(final Recipient a : _recipient_1) {
            if (!_hasElements_6) {
              _hasElements_6 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileallRecipient = this.compileallRecipient(a);
            _builder.append(_compileallRecipient, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Service> _service = policy.getService();
      boolean _isEmpty_7 = _service.isEmpty();
      boolean _not_7 = (!_isEmpty_7);
      if (_not_7) {
        _builder.append("\"Services\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Service> _service_1 = policy.getService();
          boolean _hasElements_7 = false;
          for(final Service y : _service_1) {
            if (!_hasElements_7) {
              _hasElements_7 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileService = this.compileService(y);
            _builder.append(_compileService, "    ");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    {
      EList<Enforcement> _enforcement = policy.getEnforcement();
      boolean _isEmpty_8 = _enforcement.isEmpty();
      boolean _not_8 = (!_isEmpty_8);
      if (_not_8) {
        _builder.append("\"Enforcements\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        {
          EList<Enforcement> _enforcement_1 = policy.getEnforcement();
          boolean _hasElements_8 = false;
          for(final Enforcement o : _enforcement_1) {
            if (!_hasElements_8) {
              _hasElements_8 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            CharSequence _compileEnforcement = this.compileEnforcement(o);
            _builder.append(_compileEnforcement, "    ");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileInformative(final Informative inf) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = inf.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = inf.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = inf.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refprivatedata = inf.getRefprivatedata();
      boolean _isEmpty = _refprivatedata.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        {
          EList<RefPrivateData> _refprivatedata_1 = inf.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData b : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefprivatedata5 = this.compilerrefprivatedata5(b);
            _builder.append(_compilerrefprivatedata5, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ReferToService> _refertoservice = inf.getRefertoservice();
      boolean _isEmpty_1 = _refertoservice.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Services\": [");
        {
          EList<ReferToService> _refertoservice_1 = inf.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b_1 : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoservice5 = this.compilerrefertoservice5(b_1);
            _builder.append(_compilerrefertoservice5, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefertoEnforcement> _refertoEnforcement = inf.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Enforcements\": [");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = inf.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement b_2 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoEnforcement5 = this.compilerrefertoEnforcement5(b_2);
            _builder.append(_compilerrefertoEnforcement5, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modalitykind = inf.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permission");
      if (_equals) {
        _builder.append("Permission");
      } else {
        String _modalitykind_1 = inf.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerrefprivatedata5(final RefPrivateData refpr5) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    PrivateData _refpr = refpr5.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoservice5(final ReferToService refse5) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _refertose = refse5.getRefertose();
    String _name = _refertose.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoEnforcement5(final RefertoEnforcement refe5) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Enforcement _refst = refe5.getRefst();
    String _name = _refst.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileUsage(final Usage use) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = use.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = use.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = use.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refprivatedata = use.getRefprivatedata();
      boolean _isEmpty = _refprivatedata.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        {
          EList<RefPrivateData> _refprivatedata_1 = use.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData b : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefprivatedata4 = this.compilerrefprivatedata4(b);
            _builder.append(_compilerrefprivatedata4, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ReferToService> _refertoservice = use.getRefertoservice();
      boolean _isEmpty_1 = _refertoservice.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Services\": [");
        {
          EList<ReferToService> _refertoservice_1 = use.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b_1 : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoservice4 = this.compilerrefertoservice4(b_1);
            _builder.append(_compilerrefertoservice4, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefertoEnforcement> _refertoEnforcement = use.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Enforcements\": [");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = use.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement b_2 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoEnforcement4 = this.compilerrefertoEnforcement4(b_2);
            _builder.append(_compilerrefertoEnforcement4, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modalitykind = use.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permission");
      if (_equals) {
        _builder.append("Permission");
      } else {
        String _modalitykind_1 = use.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerrefprivatedata4(final RefPrivateData refpr4) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    PrivateData _refpr = refpr4.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoservice4(final ReferToService refse4) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _refertose = refse4.getRefertose();
    String _name = _refertose.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoEnforcement4(final RefertoEnforcement refe4) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Enforcement _refst = refe4.getRefst();
    String _name = _refst.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileRetention(final Retention ret) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = ret.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = ret.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = ret.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      String _period = ret.getPeriod();
      boolean _isEmpty = _period.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Period\": \"");
        String _period_1 = ret.getPeriod();
        _builder.append(_period_1, "\t\t");
        _builder.append("\",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refprivatedata = ret.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"PrivateDatums\": [");
        {
          EList<RefPrivateData> _refprivatedata_1 = ret.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData b : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefprivatedata3 = this.compilerrefprivatedata3(b);
            _builder.append(_compilerrefprivatedata3, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ReferToService> _refertoservice = ret.getRefertoservice();
      boolean _isEmpty_2 = _refertoservice.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Services\": [");
        {
          EList<ReferToService> _refertoservice_1 = ret.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b_1 : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoservice3 = this.compilerrefertoservice3(b_1);
            _builder.append(_compilerrefertoservice3, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefertoEnforcement> _refertoEnforcement = ret.getRefertoEnforcement();
      boolean _isEmpty_3 = _refertoEnforcement.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Enforcements\": [");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = ret.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement b_2 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoEnforcement3 = this.compilerrefertoEnforcement3(b_2);
            _builder.append(_compilerrefertoEnforcement3, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modalitykind = ret.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permission");
      if (_equals) {
        _builder.append("Permission");
      } else {
        String _modalitykind_1 = ret.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerrefprivatedata3(final RefPrivateData refpr3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    PrivateData _refpr = refpr3.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoservice3(final ReferToService refse3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _refertose = refse3.getRefertose();
    String _name = _refertose.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoEnforcement3(final RefertoEnforcement refe3) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Enforcement _refst = refe3.getRefst();
    String _name = _refst.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileCollection(final Collection coll) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = coll.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = coll.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = coll.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refprivatedata = coll.getRefprivatedata();
      boolean _isEmpty = _refprivatedata.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"PrivateDatums\": [");
        {
          EList<RefPrivateData> _refprivatedata_1 = coll.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData b : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefprivatedata = this.compilerrefprivatedata(b);
            _builder.append(_compilerrefprivatedata, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ReferToService> _refertoservice = coll.getRefertoservice();
      boolean _isEmpty_1 = _refertoservice.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"Services\": [");
        {
          EList<ReferToService> _refertoservice_1 = coll.getRefertoservice();
          boolean _hasElements_1 = false;
          for(final ReferToService b_1 : _refertoservice_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoservice = this.compilerrefertoservice(b_1);
            _builder.append(_compilerrefertoservice, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefertoEnforcement> _refertoEnforcement = coll.getRefertoEnforcement();
      boolean _isEmpty_2 = _refertoEnforcement.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Enforcements\": [");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = coll.getRefertoEnforcement();
          boolean _hasElements_2 = false;
          for(final RefertoEnforcement b_2 : _refertoEnforcement_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoEnforcement = this.compilerrefertoEnforcement(b_2);
            _builder.append(_compilerrefertoEnforcement, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modalitykind = coll.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permission");
      if (_equals) {
        _builder.append("Permission");
      } else {
        String _modalitykind_1 = coll.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerrefprivatedata(final RefPrivateData refpr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    PrivateData _refpr = refpr.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoservice(final ReferToService refse) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _refertose = refse.getRefertose();
    String _name = _refertose.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoEnforcement(final RefertoEnforcement refe) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Enforcement _refst = refe.getRefst();
    String _name = _refst.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileDisclosure(final Disclosure dis) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = dis.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = dis.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Condition\": \"");
    String _condition = dis.getCondition();
    _builder.append(_condition, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ReferToRecipient> _referToRecipient = dis.getReferToRecipient();
      boolean _isEmpty = _referToRecipient.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Recipients\": [");
        {
          EList<ReferToRecipient> _referToRecipient_1 = dis.getReferToRecipient();
          boolean _hasElements = false;
          for(final ReferToRecipient b : _referToRecipient_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerreferToRecipient = this.compilerreferToRecipient(b);
            _builder.append(_compilerreferToRecipient, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refprivatedata = dis.getRefprivatedata();
      boolean _isEmpty_1 = _refprivatedata.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("\"PrivateDatums\": [");
        {
          EList<RefPrivateData> _refprivatedata_1 = dis.getRefprivatedata();
          boolean _hasElements_1 = false;
          for(final RefPrivateData b_1 : _refprivatedata_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefprivatedata2 = this.compilerrefprivatedata2(b_1);
            _builder.append(_compilerrefprivatedata2, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ReferToService> _refertoservice = dis.getRefertoservice();
      boolean _isEmpty_2 = _refertoservice.isEmpty();
      boolean _not_2 = (!_isEmpty_2);
      if (_not_2) {
        _builder.append("\"Services\": [");
        {
          EList<ReferToService> _refertoservice_1 = dis.getRefertoservice();
          boolean _hasElements_2 = false;
          for(final ReferToService b_2 : _refertoservice_1) {
            if (!_hasElements_2) {
              _hasElements_2 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoservice2 = this.compilerrefertoservice2(b_2);
            _builder.append(_compilerrefertoservice2, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefertoEnforcement> _refertoEnforcement = dis.getRefertoEnforcement();
      boolean _isEmpty_3 = _refertoEnforcement.isEmpty();
      boolean _not_3 = (!_isEmpty_3);
      if (_not_3) {
        _builder.append("\"Enforcements\": [");
        {
          EList<RefertoEnforcement> _refertoEnforcement_1 = dis.getRefertoEnforcement();
          boolean _hasElements_3 = false;
          for(final RefertoEnforcement b_3 : _refertoEnforcement_1) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerrefertoEnforcement2 = this.compilerrefertoEnforcement2(b_3);
            _builder.append(_compilerrefertoEnforcement2, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _modalitykind = dis.getModalitykind();
      boolean _equals = Objects.equal(_modalitykind, "Permission");
      if (_equals) {
        _builder.append("Permission");
      } else {
        String _modalitykind_1 = dis.getModalitykind();
        boolean _equals_1 = Objects.equal(_modalitykind_1, "Obligation");
        if (_equals_1) {
          _builder.append("Obligation");
        } else {
          _builder.append("Prohibition");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerreferToRecipient(final ReferToRecipient refrec) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Recipient _refertore = refrec.getRefertore();
    String _name = _refertore.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefprivatedata2(final RefPrivateData refpr2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    PrivateData _refpr = refpr2.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoservice2(final ReferToService refse2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _refertose = refse2.getRefertose();
    String _name = _refertose.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerrefertoEnforcement2(final RefertoEnforcement refe2) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Enforcement _refst = refe2.getRefst();
    String _name = _refst.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileallRecipient(final Recipient recip) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = recip.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Name\": \"");
    String _recipientname = recip.getRecipientname();
    _builder.append(_recipientname, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = recip.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<Partof> _partof = recip.getPartof();
      boolean _isEmpty = _partof.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Recipient_Parts\": [");
        {
          EList<Partof> _partof_1 = recip.getPartof();
          boolean _hasElements = false;
          for(final Partof b : _partof_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerpartr = this.compilerpartr(b);
            _builder.append(_compilerpartr, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _recipientTypeKind = recip.getRecipientTypeKind();
      boolean _equals = Objects.equal(_recipientTypeKind, "Individual");
      if (_equals) {
        _builder.append("Individual");
      } else {
        String _recipientTypeKind_1 = recip.getRecipientTypeKind();
        boolean _equals_1 = Objects.equal(_recipientTypeKind_1, "Organization");
        if (_equals_1) {
          _builder.append("Organization");
        } else {
          _builder.append("Individual/Organization");
        }
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Scope\": \"");
    {
      String _recipientScopeKind = recip.getRecipientScopeKind();
      boolean _equals_2 = Objects.equal(_recipientScopeKind, "Internal");
      if (_equals_2) {
        _builder.append("Internal");
      } else {
        String _recipientScopeKind_1 = recip.getRecipientScopeKind();
        boolean _equals_3 = Objects.equal(_recipientScopeKind_1, "External");
        if (_equals_3) {
          _builder.append("External");
        } else {
          _builder.append("Internal/External");
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerpartr(final Partof partr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Recipient _partof = partr.getPartof();
    String _recipientname = _partof.getRecipientname();
    _builder.append(_recipientname, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compileEnforcement(final Enforcement en) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = en.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Name\": \"");
    String _enforcementName = en.getEnforcementName();
    _builder.append(_enforcementName, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _enforcementDescription = en.getEnforcementDescription();
    _builder.append(_enforcementDescription, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _enforcementKind = en.getEnforcementKind();
      boolean _equals = Objects.equal(_enforcementKind, "Action");
      if (_equals) {
        _builder.append("Action");
      } else {
        String _enforcementKind_1 = en.getEnforcementKind();
        boolean _equals_1 = Objects.equal(_enforcementKind_1, "Algorithm");
        if (_equals_1) {
          _builder.append("Algorithm");
        } else {
          String _enforcementKind_2 = en.getEnforcementKind();
          boolean _equals_2 = Objects.equal(_enforcementKind_2, "Config");
          if (_equals_2) {
            _builder.append("Config");
          } else {
            String _enforcementKind_3 = en.getEnforcementKind();
            boolean _equals_3 = Objects.equal(_enforcementKind_3, "Process");
            if (_equals_3) {
              _builder.append("Process");
            } else {
              _builder.append("Tool");
            }
          }
        }
      }
    }
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileService(final Service s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = s.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _description = s.getDescription();
    _builder.append(_description, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<RefPrivateData> _refprivatedata = s.getRefprivatedata();
      boolean _notEquals = (!Objects.equal(_refprivatedata, Integer.valueOf(0)));
      if (_notEquals) {
        _builder.append("\"PrivateDatums\": [");
        {
          EList<RefPrivateData> _refprivatedata_1 = s.getRefprivatedata();
          boolean _hasElements = false;
          for(final RefPrivateData b : _refprivatedata_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerp = this.compilerp(b);
            _builder.append(_compilerp, "\t\t");
          }
        }
        _builder.append("],");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<ServicePartof> _servicepartof = s.getServicepartof();
      boolean _isEmpty = _servicepartof.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("\"Service_Parts\": [");
        {
          EList<ServicePartof> _servicepartof_1 = s.getServicepartof();
          boolean _hasElements_1 = false;
          for(final ServicePartof b_1 : _servicepartof_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compilerservicepartof = this.compilerservicepartof(b_1);
            _builder.append(_compilerservicepartof, "\t\t");
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compilerp(final RefPrivateData rp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    PrivateData _refpr = rp.getRefpr();
    String _name = _refpr.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilerservicepartof(final ServicePartof b) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    Service _refertoservice = b.getRefertoservice();
    String _name = _refertoservice.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    return _builder;
  }
  
  public CharSequence compilePrivateData(final PrivateData p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"ID\": \"");
    String _name = p.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _privatedata = p.getPrivatedata();
    _builder.append(_privatedata, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Type\": \"");
    {
      String _privateDataKind = p.getPrivateDataKind();
      boolean _equals = Objects.equal(_privateDataKind, "PersonalInformation");
      if (_equals) {
        _builder.append("PersonalInformation");
      } else {
        _builder.append("UsageInformation");
      }
    }
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<Attribute> _attribute = p.getAttribute();
      boolean _notEquals = (!Objects.equal(_attribute, Integer.valueOf(0)));
      if (_notEquals) {
        _builder.append("\"Attributes\": [");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        {
          EList<Attribute> _attribute_1 = p.getAttribute();
          boolean _hasElements = false;
          for(final Attribute b : _attribute_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(",", "\t\t");
            }
            CharSequence _compileatt = this.compileatt(b);
            _builder.append(_compileatt, "\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileatt(final Attribute att) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"name\": \"");
    String _name = att.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\",");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("\"Description\": \"");
    String _attributeName = att.getAttributeName();
    _builder.append(_attributeName, "\t\t");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
